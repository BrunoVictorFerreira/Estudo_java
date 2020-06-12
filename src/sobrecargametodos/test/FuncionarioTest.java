/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargametodos.test;
import sobrecargametodos.classes.Funcionario;
/**
 *
 * @author bruno.graciano
 */
public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Bruno", "123.456.789-11", 4500, "12345678");
         Funcionario funcionario2 = new Funcionario();
//        funcionario.init("Bruno","123.456.789-11",4500);
//        funcionario.init("Bruno","123.456.789-11",4500, "102030");
//        funcionario.setNome("Bruno");;
//        funcionario.setCpf("123.456.789-11");
//        funcionario.setSalario(4500);
        
        funcionario.imprime();
        funcionario2.imprime();
    }
        
        
}
