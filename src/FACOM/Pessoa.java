/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FACOM;

import java.util.Date;

/**
 *
 * @author bruno.graciano
 */
public class Pessoa {
    private String nome;
    private String dataNasc;
    private float altura;

    public Pessoa(String nome, String dataNasc, float altura) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.altura = altura;
    }
    
    
    
    public void imprime(){
        System.out.println("Nome: " + this.nome + "\nData de nascimento: " + this.dataNasc + "\nAltura: " + this.altura);
    }
    
    public void calculaIdade(){
        Date data = new Date();
        String nova = data.toString().substring(24);
        System.out.println(Integer.parseInt(nova) - Integer.parseInt(this.dataNasc));
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
