/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesAbstratas.classes;

/**
 *
 * @author bruno.graciano
 */
public abstract class Funcionario extends Pessoa{
    protected String clt;
    protected double salario;
    
    public abstract void calculaSalario();

    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", CLT: " + this.clt + ", Salario: " + this.salario;
    }
    
    public abstract void imprime();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
