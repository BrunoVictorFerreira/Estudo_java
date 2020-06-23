/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings.test;

/**
 *
 * @author bruno.graciano
 */
public class StringTest {
    public static void main(String[] args) {
        String nome = "William";
        String sobrenome = new String("Suane");
        String nome2 = "Willian";
        
        String teste = "GOKU";
//        System.out.println(teste.charAt(10));
        String teste2 = "    01 2 3 4 5 67 8 9    ";
        System.out.println(teste.equals(teste2));
        System.out.println(teste.length());
        System.out.println(teste.replace(" ", ""));
        System.out.println(teste2.toUpperCase());
        System.out.println(teste2.substring(0,5));
        System.out.println(teste2.trim());
        
    };
}
