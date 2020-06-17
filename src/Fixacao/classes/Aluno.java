/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fixacao.classes;

/**
 *
 * @author bruno.graciano
 */
public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;
    
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno() {
    }

    public void print(){
        System.out.println("-----Aluno-----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if(this.seminario != null){
            System.out.println("Seminario que este aluno participa: " + this.seminario.getTitulo());
        }else{
            System.out.println("Este aluno não participa de nenhum seminário");
        }
    }
    
    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
