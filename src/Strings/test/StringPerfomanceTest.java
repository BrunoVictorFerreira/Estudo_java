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
public class StringPerfomanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto String " + (fim - inicio) + " ms");
        
        inicio = System.currentTimeMillis();
        concatStringBuilder(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder " + (fim - inicio) + " ms");
        
        inicio = System.currentTimeMillis();
        concatStringBuffer(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuffer " + (fim - inicio) + " ms");
        
        System.out.println(fim);
    }
    
    private static void concatString(int tam){
        String string = "";
        for(int i =0; i < tam; i++){
            string += i;
        }
    }
    
    private static void concatStringBuilder(int tam){
        StringBuilder ab = new StringBuilder(tam);
        for(int i =0; i < tam; i++){
            ab.append(i);
        }
    }
    
    private static void concatStringBuffer(int tam){
        StringBuffer sb = new StringBuffer(tam);
        for(int i =0; i < tam; i++){
            sb.append(i);
        }
    }
}
