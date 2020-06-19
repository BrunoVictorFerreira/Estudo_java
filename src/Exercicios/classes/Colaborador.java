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
public interface Colaborador {
    double VALOR_BASE = 10;
    double obtemSalario();
    void cargaHoraria(int cargaHoraria);
}
