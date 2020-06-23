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
public class StringBuilderTest {
    public static void main(String[] args) {
        String s = "Uma frase comum";
        StringBuilder sb = new StringBuilder(16);
        sb.append("0123456789");
        s = sb.toString();
        System.out.println(sb.delete(0, 2));
    }
}
