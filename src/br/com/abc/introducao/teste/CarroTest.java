/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.abc.introducao.teste;
import br.com.abc.introducao.classes.Carro;
/**
 *
 * @author bruno.graciano
 */
public class CarroTest {
    public static void main(String[] args) {
        
        Carro carro = new Carro();
        carro.modelo = "Fusca";
        carro.placa = "ABC1234";
        carro.velocidadeMaxima = 120f;
        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);
    }
}
