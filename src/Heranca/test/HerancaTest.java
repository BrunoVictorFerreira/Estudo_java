/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca.test;
import Heranca.classes.Pessoa;
import Heranca.classes.Endereco;
import Heranca.classes.Funcionario;
/**
 *
 * @author bruno.graciano
 */
public class HerancaTest {
    public static void main(String[] args) {
//        Pessoa p = new Pessoa("Gina");
//        p.setCpf("12345");
        
        Endereco end = new Endereco();
        end.setBairro("Bairro 1");
        end.setRua("Rua 25");
        
//        p.setEndereco(end);
        
//        p.imprime();
        System.out.println("----------------------");
        Funcionario f = new Funcionario("Augusto");
        f.setCpf("987654");
        f.setSalario(15000);
        f.setEndereco(end);
//        f.imprime();
        
    }
}
