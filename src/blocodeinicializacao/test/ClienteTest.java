/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blocodeinicializacao.test;
import blocodeinicializacao.classes.Cliente;
/**
 *
 * @author bruno.graciano
 */
public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println("Exibindo");
        for(int parcela : cliente.getParcelas()){
            System.out.print(parcela + " ");
        }
    }
}
