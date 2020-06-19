/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesAbstratas.Test;
import classesAbstratas.classes.Gerente;
import classesAbstratas.classes.Vendedor;
/**
 *
 * @author bruno.graciano
 */
public class Test {
    public static void main(String[] args) {
        Gerente g = new Gerente("Bruno", "123", 1000);
        Vendedor v = new Vendedor("Fabricio", "456", 1000, 5000);
        g.calculaSalario();
        v.calculaSalario();
        System.out.println(g);
        System.out.println(v);
    }
}
