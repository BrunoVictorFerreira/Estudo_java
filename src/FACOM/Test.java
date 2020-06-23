/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FACOM;

import java.util.Date;

/**
 *
 * @author bruno.graciano
 */
public class Test {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Bruno", "1999", 1.82f);
        Agenda a = new Agenda();
        a.armazenaPessoa("Bruno", "20", 1.82f);
        Agenda b = new Agenda();
        b.armazenaPessoa("Fabricio", "16", 1.84f);
        a.imprimeAgenda();
//        a.armazenaPessoa("teste", 0, 0);
//        p.calculaIdade();
        
    }
}
