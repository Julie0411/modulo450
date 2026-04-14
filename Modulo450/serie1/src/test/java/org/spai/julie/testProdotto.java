package org.spai.julie;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testProdotto {
    @Test
    @DisplayName("Testing getNome() method to see if it returns the correct value")
    public void testGetName() {
        Prodotto p = new Prodotto("Libro", 12.5f);
        assertEquals("Libro", p.getNome());
    }

    @Test
    @DisplayName("Testing getPrezzo() method to see if it returns the correct value")
    public void testGetPrice() {
        Prodotto p = new Prodotto("Libro", 12.5f);
        assertEquals(12.5f, p.getPrezzo());
    }

    @Test
    @DisplayName("Testing prodotto constructor to assert if when I pass a null name it throws an exception")
    public void testNameNull() {
        assertThrows(IllegalArgumentException.class, ()-> {new Prodotto(null, 12.5f);});
    }

    @Test
    @DisplayName("Testing prodotto constructor to assert if when I pass a prize that is less it throws an exception")
    public void testConstructorInvalidPrize() {
        assertThrows(IllegalArgumentException.class, () -> {new Prodotto("libro", -45.7f);});
    }

    @Test
    @DisplayName("Testing prodotto constructor to assert if when I pass two invalid values it throws an exception")
    public void testConstructorInvalidValues() {
        assertThrows(IllegalArgumentException.class, () -> {new Prodotto(null, -45.7f);});
    }
}
