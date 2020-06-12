/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadorestatico.test;
import modificadorestatico.classes.Carro;
/**
 *
 * @author bruno.graciano
 */
public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(220);
        Carro c = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 275);
        Carro c3 = new Carro("Mercedes", 290);
        
        c.imprime();
        c2.imprime();
        c3.imprime();
        System.out.println("==============");
        
        
        
        c.imprime();
        c2.imprime();
        c3.imprime();
        
    }
}
