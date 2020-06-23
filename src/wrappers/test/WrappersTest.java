/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrappers.test;

/**
 *
 * @author bruno.graciano
 */
public class WrappersTest {
    public static void main(String[] args) {
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10L;
        float floatPrimitivo = 10f;
        double doublePrimitivo  = 10D;
        char charPrimitivo = 'A';
        boolean cooleanPrimitivo = true;
        
        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer intWrapper = new Integer("10");
        Long longWrapper = Long.valueOf("10");
        Float floatWrapper = new Float("10.2");
        Double doubleWrapper = 10D;
        Character charWrapper = new Character('A');
        Boolean booleanWrapper = new Boolean("TrUe");
        
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toUpperCase('9'));
        
        
    }
}
