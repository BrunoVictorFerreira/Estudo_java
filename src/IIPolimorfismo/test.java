/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IIPolimorfismo;

/**
 *
 * @author bruno.graciano
 */
public class test {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.mostraDados();
    
        Produto p2 = new Livro(); //tem polimorfismo
        p2.mostraDados();
        
        Livro l1 = new Livro(); //não tem polimorfismo
        l1.mostraDados();
        l1.mostraAutor();
        
        Livro l2 = (Livro) l1;
        l2.mostraAutor();
        
        Produto p3 = new Revista();
        p3.mostraDados();
        
    }
}
