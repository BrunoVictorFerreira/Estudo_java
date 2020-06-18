/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.classes;

/**
 *
 * @author bruno.graciano
 */
public class Writer {
    private String name;
    private Book[] books;

    public Writer(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    public Writer() {
    }

    public void print(){
        System.out.println("Nome: " + this.name);
        System.out.println("Livros: ");
        for(Book book : books){
            System.out.print(book.getTitle());
            if("MYSTERY".equals(BookCategory.MYSTERY)){
                System.out.print("Mistério | ");
            }else if("SCIENCE_FICTION".equals(BookCategory.SCIENCE_FICTION)){
                System.out.println("Ficção científica");
            }else{
                System.out.println("Biografia");
            }
            System.out.println("");
        }
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
    
    
    
}
