/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio;
import java.util.*;
/**
 *
 * @author bruno.graciano
 */
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Digite em anos: ");
//        int ano = in.nextInt();
//        System.out.println("Digite em meses: ");
//        int mes = in.nextInt();
//        System.out.println("Digite em dias: ");
//        int dia = in.nextInt();
//        
//        int dias = 0;
//        dias += (ano * 365);
//        dias += (mes * 30);
//        dias += dia;
//        
//        System.out.println("Dias totais de vida: " + dias);
        
        
        antSuc(10);

    }
    
    private static void antSuc(int num){
        int ant = num - 1;
        int suc = num + 1;
        int[] numArray = new int[]{ant, suc};
        System.out.println(numArray[0] + " " + num + " " + numArray[1]);
        
    }
}
