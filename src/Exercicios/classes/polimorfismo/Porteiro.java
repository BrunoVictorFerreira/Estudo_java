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
public class Porteiro extends Funcionario{
    
    @Override
    public double salario() {
        return this.salario;
    }
    
}
