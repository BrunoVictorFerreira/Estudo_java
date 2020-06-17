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
public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {
    }

    public void print(){
        System.out.println("-----Professor-----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if(this.seminarios != null && this.seminarios.length != 0){
            System.out.println("Seminarios desse professor: ");
            for(Seminario sem : seminarios){
                System.out.println(sem.getTitulo());
            }
        }else{
            System.out.println("Este Professor não está cadastrado em nenhum seminário");
        }
    }
    
    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
}
