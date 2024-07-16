package com.alura.Challenge.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosLivro(@JsonAlias("results") List<String> resultados,
                         Integer id,
                         @JsonAlias("title") String titulo,
                         @JsonAlias("authors") List<DadosAutor> autor) { }


