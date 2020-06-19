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
public class Vendedor extends Funcionario {
    private double totalVendas;
    public Vendedor(String nome, String clt, double salario, double totalVendas){
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }
    
    @Override
    public void imprime(){
    
    }
    
    @Override
    public void calculaSalario(){
        this.salario += this.totalVendas * 0.05; 
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
    
    
}
