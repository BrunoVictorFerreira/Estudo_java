/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.classes;

/**
 *
 * @author bruno.graciano
 */
public class Funcionario implements Colaborador{
    private String nome;
    private int cargaHoraria;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    @Override
    public double obtemSalario() {
        return (this.cargaHoraria * VALOR_BASE * 2 )* 30;
    }

    @Override
    public void cargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
