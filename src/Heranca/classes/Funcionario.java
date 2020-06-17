/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca.classes;

/**
 *
 * @author bruno.graciano
 */
public class Funcionario extends Pessoa{
    private double salario;
    
    {
        System.out.println("Bloco de inicialização de funcionario 1");
    }
    {
        System.out.println("Bloco de inicialização de funcionario 2");
    }
    static {
        System.out.println("Bloco de inicialização Estático de funcionário");
    }
    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }
    
    public void imprime(){
        super.imprime();
        System.out.println("Salario: " + this.salario);
        imprimeReciboPagamento();
    }
    
    public void imprimeReciboPagamento(){
        System.out.println("Eu " + super.nome + " recebi o pagamento de " + this.salario);
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
