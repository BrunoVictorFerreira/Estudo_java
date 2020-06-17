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
public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;
    private Professor professor;
    
    
    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }
    
    public void print(){
        System.out.println("-----Seminário-----");
        System.out.println("Titulo : " + this.titulo);
        if(this.local != null){
            System.out.println("Local: " + this.local.getRua() + ", " +this.local.getBairro());
        }else{
            System.out.println("Este seminário não tem nenhum local");
        }
        if(this.alunos != null && this.alunos.length != 0){
            System.out.print("Alunos: ");
            for(Aluno aluno : alunos){
                System.out.print(aluno.getNome() + " ");
            }
            System.out.println("");
        }else{
            System.out.println("Não há nenhum aluno neste seminário");
        }
        if(this.professor != null){
            System.out.println("Professor: " + this.professor.getNome());
        }else{
            System.out.println("Não há nenhum professor neste seminário");
        }
        
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
