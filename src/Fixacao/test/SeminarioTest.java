/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fixacao.test;
import Fixacao.classes.Aluno;
import Fixacao.classes.Local;
import Fixacao.classes.Professor;
import Fixacao.classes.Seminario;

/**
 *
 * @author bruno.graciano
 */
public class SeminarioTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Bruno victor", 20);
        Aluno aluno2 = new Aluno("Daniel oliveira", 21);
        
        Local local = new Local("Sobradinho", "Area 2");
        
        Professor prof = new Professor("Salvador", "Informática");
        
        Seminario sem = new Seminario("Segurança na TI");
        
        Aluno[] alunos = new Aluno[2];
        alunos[0] = aluno;
        alunos[1] = aluno2;
        
        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);
        
        Seminario[] seminarios = new Seminario[]{sem};
        prof.setSeminarios(seminarios);
        
        sem.setAlunos(alunos);
        sem.setLocal(local);
        sem.setProfessor(prof);
        
        
        
        sem.print();
        aluno.print();
        aluno2.print();
        prof.print();
        local.print();
    }
}
