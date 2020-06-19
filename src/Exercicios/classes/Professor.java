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
public interface Professor {
    int GRADUACAO = 0;
    int MESTRADO = 20;
    int DOUTORADO = 50;
    
    void obtemTitulacao(int titulacao);
}
