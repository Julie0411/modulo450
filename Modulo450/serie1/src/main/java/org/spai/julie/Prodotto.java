package org.spai.julie;

public class Prodotto {
    private String nome;
    private float prezzo;

    public Prodotto(String nome, float prezzo) {
        if (nome == null) throw new IllegalArgumentException("You should pass a name!");
        if (prezzo < 0) throw new IllegalArgumentException("You should pass a valid price not a negative number!");
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return this.nome;
    }

    public float getPrezzo() {
        return this.prezzo;
    }

    @Override
    public String toString() {
        return "prodotto: " + nome + "; prezzo: " + prezzo + " chf";
    }
}
