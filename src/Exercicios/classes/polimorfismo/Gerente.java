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
public class Gerente extends Funcionario{
    private static final double AUMENTO = 0.5;
    
    public Gerente(String clt, String escolaridade, double salario) {
        this.clt = clt;
        this.escolaridade = escolaridade;
        this.salario = salario;
    }
    
    @Override
    public double salario() {
        return this.salario += (this.salario * AUMENTO);
    }

    
    
    
    
}
