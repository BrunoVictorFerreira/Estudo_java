/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.test;
import Exercicio.classes.Book;
import Exercicio.classes.BookCategory;
import Exercicio.classes.Library;
import Exercicio.classes.Writer;
/**
 *
 * @author bruno.graciano
 */
public class BookTest {
    public static void main(String[] args) {
        Book a = new Book("Como Juntar", BookCategory.MYSTERY);
        Book b = new Book("Como afastar", BookCategory.BIOGRAPHY);
        Book c = new Book("Como Voar", BookCategory.SCIENCE_FICTION);
        Book[] arrBook = new Book[]{a,b,c};
        Writer w = new Writer("Bruno Victor", arrBook);
        w.print();
        
    }
}
