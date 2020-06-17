/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.test;
import Exercicio.classes.Aluno;
import Exercicio.classes.Local;
import Exercicio.classes.Professor;
import Exercicio.classes.Seminario;

/**
 *
 * @author bruno.graciano
 */
public class SeminarioTest {
    public static void main(String[] args) {
        Seminario sem = new Seminario("Como ser um programador");
        Professor prof = new Professor("Yoda", "Médico");
        Local local = new Local("Rua das araras", "Mato");
        Aluno aluno = new Aluno("Bruno", 20);
        Aluno aluno2 = new Aluno("Fabricio", 15);

        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);
        
        
        sem.setProfessor(prof);
        sem.setLocal(local);
        
        sem.setAlunos(new Aluno[]{aluno, aluno2});
        
        Seminario[] semArray = new Seminario[1];
        semArray[0] = sem;
        prof.setSeminario(semArray);
        
        sem.print();
//        prof.print();
//        local.print();
    }
}
