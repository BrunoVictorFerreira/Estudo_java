/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.abc.introducao.teste;

import br.com.abc.introducao.classes.Estudante;
/**
 *
 * @author bruno.graciano
 */
public class estudanteTest {
    public static void main(String[] args){
        
        Estudante estudante = new Estudante();
        estudante.setNome("Bruno");
        estudante.setIdade(-1);
        estudante.setNotas(new double[]{3,2,9.5});
        estudante.imprime(estudante);

        
    }

}
