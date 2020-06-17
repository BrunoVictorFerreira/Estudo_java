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
public class Livro {
    private String titulo;
    private int data;
    private Autor[] autores;
    private Editora editora;

    public Livro(String titulo, int data) {
        this.titulo = titulo;
        this.data = data;
    }

    public Livro() {
    }

    public void print(){
        System.out.println("-----Livro-----");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Data: " + this.data);
        if(this.autores != null && this.autores.length != 0){
            System.out.println("Autores: ");
            for(Autor autor : autores){
                System.out.println(autor.getAutor());
            }
        }else{
            System.out.println("Nenhum autor adicionado");
        }
        System.out.println("Editora: " + this.editora.getNome());
    }
    
    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    
    public Autor[] getAutores() {
        return autores;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    
    
    
}
