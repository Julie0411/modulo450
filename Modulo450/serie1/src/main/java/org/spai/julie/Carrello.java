package org.spai.julie;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
    List<Prodotto> carrello = new ArrayList<>();
    private Prodotto p;

    public Carrello(Prodotto p) {
        this.p = p;
        carrello.add(p);
    }

    public Carrello() {
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        if (prodotto == null) throw new IllegalArgumentException("In order to add a product to your cart you must pass a prodotto!");
        carrello.add(prodotto);
    }

    public void rimuoviProdotto(Prodotto prodotto) {
        if (prodotto == null) throw new IllegalArgumentException("In order to remove a product to your cart you must pass a prodotto!");
        carrello.remove(prodotto);
    }

    public boolean vuoto() {
        return carrello.isEmpty();
    }

    public int numeroDiProdotti() {
        return carrello.size();
    }

    public String getProdotti() {
        List<String> prodotti = new ArrayList<>();
        for (Prodotto p : carrello) {
            prodotti.add(p.toString());
        }
        return String.valueOf(prodotti);
    }

    public float prezzoTotale() {
        float totale = 0f;
        for (Prodotto p : carrello) {
            totale += p.getPrezzo();
        }
        return totale;
    }

}
