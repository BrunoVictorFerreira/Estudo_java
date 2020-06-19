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
public class Gerente extends Funcionario{
    

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
        
    }
        
    @Override
    public void imprime(){
        System.out.println("Dentro do metodo imprime");
    }
    @Override
    public void calculaSalario(){
        this.salario += this.salario * 0.2;
    }
}
