package com.alura.Challenge.main;

import com.alura.Challenge.DTO.LivroDTO;
import com.alura.Challenge.model.DadosAutor;
import com.alura.Challenge.model.DadosLivro;
import com.alura.Challenge.service.ConsumoApi;
import com.alura.Challenge.service.ConverteDados;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static java.util.Comparator.comparing;

public class Main {

    private ConsumoApi consumoApi = new ConsumoApi();
    private ConverteDados converteDados = new ConverteDados();
    private Scanner sc = new Scanner(System.in);
    private final String URL = "https://gutendex.com//books?search=";
    private List<DadosLivro> livros = new ArrayList<>();


    public void exibeMenu(){

        int opcao;

        do {

            System.out.println("****************************");
            System.out.println("MENU");
            System.out.println("1 - Buscar livro pelo título;");
            System.out.println("2 - Listar livros registrados;");
            System.out.println("3 - Listar autores registrados;");
            System.out.println("0 - Sair;");
            System.out.println("****************************");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    bucarLivroAPI();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    listarAutores();
                default:
                    System.out.println("Digite um número válido!");
                    break;
            }

        }while(opcao != 0);


    }



    private DadosLivro cadastrarLivroAPI() {
        System.out.println("Digite o nome do livro: ");
        var nomeLivro = sc.nextLine();
        var urlLivro = URL + nomeLivro.replace(" ", "+").toLowerCase().trim();
        var json = consumoApi.obterDados(urlLivro);
        DadosLivro dadosLivro = converteDados.obterDados(json, DadosLivro.class);
        return dadosLivro;
    }

    private void bucarLivroAPI(){
        DadosLivro dadosLivro = cadastrarLivroAPI();
        livros.add(dadosLivro);
    }
    private void listarLivros(){
        System.out.println(livros);
    }
    private void listarAutores() {
        livros.forEach(a -> a.autor());
    }

}