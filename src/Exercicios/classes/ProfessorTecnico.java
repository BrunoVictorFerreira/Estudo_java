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
public class ProfessorTecnico implements Colaborador, Professor{

    private int cargaHoraria;
    private int titulacao;
    private String nome;

    public ProfessorTecnico(String nome) {
        this.nome = nome;
    }
    
    @Override
    public double obtemSalario() {
        switch (this.titulacao) {
            case 20:
                return cargaHoraria * VALOR_BASE * 3 * 30 * 20;
            case 50:
                return cargaHoraria * VALOR_BASE * 3 * 3 * 50;
            default:
                return cargaHoraria * VALOR_BASE * 3 * 30;
        }
    }

    @Override
    public void cargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public void obtemTitulacao(int titulacao) {
        this.titulacao = titulacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
