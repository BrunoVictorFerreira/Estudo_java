/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.classes.polimorfismo;

/**
 *
 * @author bruno.graciano
 */
public abstract class Funcionario extends Pessoa{
    protected String clt;
    protected String escolaridade;
    protected double salario;

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
    
    public abstract double salario();
}
