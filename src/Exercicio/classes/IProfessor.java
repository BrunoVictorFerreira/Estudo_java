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
public class IProfessor extends Pessoa implements IPerson{
    private double salary;

    public IProfessor(String firstName, String lastName,double salary) {
        this.salary = salary;
        this.firstname = firstName;
        this.lastName = lastName;
    }

    public IProfessor() {
    }

    @Override
    public String toString() {
        return "Primeiro Nome: " + this.firstname + " Último nome: " + this.lastName + " Salario: " + this.salary;
    }
    
    

    
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
