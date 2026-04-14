package org.spai.julie;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testCarrello {

    @Test
    @DisplayName("Testing testAggiungiProdotto() method to see if it add a product to the cart")
    public void testAggiungiProdotto() {
        Carrello c = new Carrello();
        Prodotto p = new Prodotto("Libro", 12.5f);
        c.aggiungiProdotto(p);
        assertEquals(1, c.numeroDiProdotti());
    }

    @Test
    @DisplayName("Testing testAggiungiProdottoWhenProdottoIsNull() method to see if it throws an exception when i pass a null product")
    public void testAggiungiProdottoWhenProdottoIsNull() {
        Carrello c = new Carrello();
        assertThrows(IllegalArgumentException.class, ()-> {c.aggiungiProdotto(null);});
    }

    @Test
    @DisplayName("Testing testAggiungiProdotto() method to see if it removes a product to the cart")
    public void testRimuoviProdotto() {
        Prodotto p = new Prodotto("Libro", 12.5f);
        Carrello c = new Carrello(p);
        c.rimuoviProdotto(p);
        assertEquals(0, c.numeroDiProdotti());
    }

    @Test
    @DisplayName("Testing testRimuoviProdottoWhenProdottoIsNull() method to see if it throws an exception when i pass a null product")
    public void testRimuoviProdottoWhenProdottoIsNull() {
        Carrello c = new Carrello();
        assertThrows(IllegalArgumentException.class, ()-> {c.rimuoviProdotto(null);});
    }

    @Test
    @DisplayName("Testing testAggiungiProdotto() method to see if tells if the cart is empty")
    public void testCarrelloVuoto() {
        Carrello c = new Carrello();
        assertTrue(c.vuoto());
    }

    @Test
    @DisplayName("Testing testAggiungiProdotto() method to see if tells if the cart is not empty")
    public void testCarrelloNonVuoto() {
        Prodotto p = new Prodotto("Libro", 12.5f);
        Carrello c = new Carrello(p);
        assertFalse(c.vuoto());
    }

    @Test
    @DisplayName("Testing testAggiungiProdotto() method to see if tells if it can print product in the right way")
    public void testGetProdotti() {
        Carrello c = new Carrello();
        Prodotto p = new Prodotto("Libro", 12.5f);
        c.aggiungiProdotto(p);
        assertEquals("[prodotto: Libro; prezzo: 12.5 chf]", c.getProdotti());
    }

    @Test
    @DisplayName("Testing testAggiungiProdotto() method to see if tells if it can make the total price of the cart")
    public void testPrezzoTotale() {
        Carrello c = new Carrello();
        Prodotto p = new Prodotto("Libro", 12.5f);
        c.aggiungiProdotto(p);
        assertEquals(12.5f, c.prezzoTotale());
    }

}
