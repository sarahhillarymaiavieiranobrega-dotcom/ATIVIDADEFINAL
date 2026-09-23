/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.escola1;

/**
 *
 * @author sarah62076366
 */

public class Estudante{

    String nome;
    String sobrenome;
    String cor;
    String turno;
    int anoNascimento;
    int idade;
    int anoAtual;
    String endereco;

    public Estudante(String nomeInformado, String sobrenomeInformado,
            String corInformada, String turnoInformado,
            int anoNascimentoInformado, String enderecoInformado) {

        nome = nomeInformado;
        sobrenome = sobrenomeInformado;
        cor = corInformada;
        turno = turnoInformado;
        anoNascimento = anoNascimentoInformado;
        endereco = enderecoInformado;
        anoAtual = 2026; 
    }

    public void calcular() {
        idade = anoAtual - anoNascimento;
        System.out.println("Idade: " + idade);
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Cor: " + cor);
        System.out.println("Turno: " + turno);
        System.out.println("Ano de nascimento: " + anoNascimento);
        System.out.println("Idade: " + idade);
        System.out.println("Endereco: " + endereco);
        System.out.println("-------------------------");
    }
}
