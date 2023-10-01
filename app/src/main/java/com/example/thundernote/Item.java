package com.example.thundernote;

public class Item {
    private int image;
    private String titulo;

    public Item(int image, String titulo) {
        this.image = image;
        this.titulo = titulo;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
