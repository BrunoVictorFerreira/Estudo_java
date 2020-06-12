/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadorestatico.test;
import modificadorestatico.classes.Cliente;
/**
 *
 * @author bruno.graciano
 */
public class ClienteTest {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        
        System.out.println("Exibindo");
        for(int parcela : Cliente.getParcelas()){
            System.out.print(parcela + " ");
        }
        
        System.out.println("tamanho" + Cliente.getParcelas().length);
    }
}
