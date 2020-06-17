/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.test;
import Exercicio.classes.Autor;
import Exercicio.classes.Editora;
import Exercicio.classes.Livro;
/**
 *
 * @author bruno.graciano
 */
public class LivroTest {
    public static void main(String[] args) {
        Livro livro = new Livro("Como ser um programador", 23111999);
        Autor autor = new Autor("Bruno victor", 123456789);
        Editora editora = new Editora("Sol", 123);
        
        livro.setAutores(new Autor[]{autor});
        livro.setEditora(editora);
        
        livro.print();
        
    }
}
