/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.test;
import Exercicio.classes.IProfessor;
import Exercicio.classes.IStudent;
/**
 *
 * @author bruno.graciano
 */
public class PessoaTest {
    public static void main(String[] args) {
        IProfessor p = new IProfessor("Bruno", "Graciano" ,4000f);
        IStudent s = new IStudent("Fabricio", "Graciano", 15);
        System.out.println(p);
        System.out.println("-----------");
        System.out.println(s);
        
    }
}
