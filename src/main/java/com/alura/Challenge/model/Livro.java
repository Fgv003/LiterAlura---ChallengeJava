package com.alura.Challenge.model;

public class Livro {
    private long id;
    private String titulo;
    private Autor autor;

    public Livro(){}

    public Livro(long id, String titulo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = new Autor();
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "id= " + id +
                ", titulo= '" + titulo +
                ", autor= " + autor;
    }
}
