package com.alura.Challenge.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public class Livro {
    private long id;
    private String titulo;
    private Autor autores;

    public Livro(){}

    public Livro(long id, String titulo, Autor autores) {
        this.id = id;
        this.titulo = titulo;
        this.autores = new Autor();
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
                ", autor= " + autores;
    }
}
