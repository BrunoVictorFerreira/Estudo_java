/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loiane;

/**
 *
 * @author bruno.graciano
 */
public class Test {
    public static void main(String[] args) {
       DiaSemana dia = DiaSemana.SEGUNDA;
        System.out.println(dia.toString() + " - " + dia.getValor());
        
        Data data = new Data(1 , 4 , 2016, DiaSemana.SEXTA);
    }
}
