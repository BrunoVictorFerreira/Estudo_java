/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadorFinal.test;
import modificadorFinal.classes.Carro;
/**
 *
 * @author bruno.graciano
 */
public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getComprador());
        c.getComprador().setNome("Bruno");
        
        System.out.println(c.getComprador());
        
    }
}
