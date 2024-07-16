package com.alura.Challenge.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Autor {
    private long id;
    private String nome;
    private String dataNascimento;
    private String dataMorte;

    public Autor() {}

    public Autor(long id, String nome, String dataNascimento, String dataMorte) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.dataMorte = dataMorte;
    }

    public String getDataMorte() {
        return dataMorte;
    }

    public void setDataMorte(String dataMorte) {
        this.dataMorte = dataMorte;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  "id= " + id +
                ", nome= '" + nome + '\'' +
                ", dataNascimento= '" + dataNascimento +
                ", dataMorte= '" + dataMorte;
    }
}
