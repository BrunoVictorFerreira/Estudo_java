/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.abc.introducao.classes;

/**
 *
 * @author bruno.graciano
 */
public class Calculadora {
    public void somaDoisNumeros(int num, int num2){
        System.out.println(num+num2);
    }
    public void subDoisNumeros(int num, int num2){
        System.out.println(num - num2);
    }
    public int multDoisNumeros(int num1, int num2){
        double result;
        if(num2 != 0){
            return num1 / num2;
        }
        return 0;

    }
    public String nome;
    public int idade;
    public boolean sexo;
    public void imprime(){
        System.out.println("Nome: " + nome + " idade: " + idade + " sexo: " + sexo);
    }
    
    public void imprimeDoisNumerosDivididos(double num1, double num2){
        System.out.println(num2 != 0 ? num1 / num2 : 0);
        
    }
    
    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    
    public void somaVarArgs(int...numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
            
}
