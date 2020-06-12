/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargametodos.classes;

/**
 *
 * @author bruno.graciano
 */
public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;
    
    public Estudante(String matricula, String nome, double[] notas){
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }
    
    public Estudante(String matricula, String nome, String dataMatricula, double[] notas){
        this();
        this.dataMatricula = dataMatricula;
    }
    
    public Estudante(){
        System.out.println("Construtor padão");
    }
    
    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nota
     */
    public double[] getNota() {
        return notas;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(double[] nota) {
        this.notas = nota;
    }
    
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for(double nota : notas){
            System.out.println(nota + " ");
        }
        System.out.println(this.dataMatricula);

    }
    
}
