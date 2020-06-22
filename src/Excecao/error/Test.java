/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecao.error;

/**
 *
 * @author bruno.graciano
 */
public class Test {
    public static void main(String[] args) {
        stackOverflowError();
    }
    
    public static void stackOverflowError(){
        stackOverflowError();
    }
}
