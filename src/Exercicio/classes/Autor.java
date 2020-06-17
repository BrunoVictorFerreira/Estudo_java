/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.classes;

/**
 *
 * @author bruno.graciano
 */
public class Autor {
    private String autor;
    private int inscricao;
    
    public Autor(String autor, int inscricao) {
        this.autor = autor;
        this.inscricao = inscricao;
    }

    public Autor() {
    }
    
    public void print(){
        System.out.println("-----Autor-----");
        System.out.println("Nome: " + this.autor);
        System.out.println("Inscrição: " + this.inscricao);
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getInscricao() {
        return inscricao;
    }

    public void setInscricao(int inscricao) {
        this.inscricao = inscricao;
    }
    
    
}
