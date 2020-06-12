/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.abc.introducao.classes;

/**
 *
 * @author bruno.graciano
 */
public class Estudante {
    private String nome;
    private int idade;
    private double[] notas = new double[3];
    private boolean aprovado;
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public double[] getNotas(){
        return this.notas;
    }
    
    public void setNotas(double[] notas){
        this.notas = notas;
    }
    
    public boolean isAprovado(){
        return this.aprovado;
    }
    
    
    public void imprime(Estudante estudante){
        
        System.out.println("Nome: " + this.nome + " idade: " + this.idade + " Notas: ");
        int soma = 0;
        for(double nota : this.notas){
            System.out.println(nota);
            soma += nota;
        }
        
        double media = soma/ this.notas.length;
        System.out.println("Média: " + media);
        System.out.println(media > 6? "Aprovado" : "Reprovado");
    }

    
}
