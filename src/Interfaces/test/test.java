/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.test;
import Interfaces.classes.Produto;
/**
 *
 * @author bruno.graciano
 */
public class test {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 4, 3000);
        p.calcularImposto();
        p.calcularFrete();
        System.out.println(p);
    }
}
