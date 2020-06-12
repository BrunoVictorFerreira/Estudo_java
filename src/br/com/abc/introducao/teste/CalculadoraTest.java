/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.abc.introducao.teste;

import br.com.abc.introducao.classes.Calculadora;
/**
 *
 * @author bruno.graciano
 */
public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros(2,2);
        calc.subDoisNumeros(2, 1);
        calc.imprimeDoisNumerosDivididos(20, 5);
        calc.nome = "Bruno";
        calc.idade = 20;
        calc.sexo = true;
        int[] numeros = {1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5);
        
    }
}
