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
public class IStudent extends Pessoa implements IPerson{
    private int idade;

    public IStudent(String firstName, String lastName, int idade) {
        this.idade = idade;
        this.firstname = firstName;
        this.lastName = lastName;
    }

        @Override
    public String toString() {
        return "Primeiro Nome: " + this.firstname + " Último nome: " + this.lastName + " Idade: " + this.idade;
    }
    
    public IStudent() {
    }
    
    public int getMajor() {
        return idade;
    }

    public void setMajor(int idade) {
        this.idade = idade;
    }
    
}
