/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum.test;
import Enum.classes.Cliente;
import Enum.classes.TipoCliente;
/**
 *
 * @author bruno.graciano
 */
public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente("Bruno", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(c);
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
    }
    
}
