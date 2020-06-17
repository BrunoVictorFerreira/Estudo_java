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
public class Editora {
    private String nome;
    private int codigo;

    public Editora(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public Editora() {
    }

    public void print(){
        System.out.println("-----Editora-----");
        System.out.println("Nome editora: " + this.nome);
        System.out.println("Código: " + this.codigo);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
