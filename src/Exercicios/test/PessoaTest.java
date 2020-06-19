/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.test;
import Exercicios.classes.Estagiario;
import Exercicios.classes.Funcionario;
import Exercicios.classes.ProfessorTecnico;
import Exercicios.classes.ProfessorGraduacao;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author bruno.graciano
 */
public class PessoaTest {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        Scanner it = new Scanner(System.in);
        String[] colaboradores;
        int tamanhoArray;
        int opcao;
        do{
            System.out.println("O que deseja Fazer?\n1 - Cadastrar\n2 - Listar\n3 - Sair");
            opcao = it.nextInt();
            
            if(opcao == 1){
                System.out.println("1 - Estagiario\n2 - Funcionario\n3 - Professor técnico\n4 - Professor Graduacao\n5 - Sair");
                int opcaoServidor = it.nextInt();
                switch(opcaoServidor){
                    case 1:
                        System.out.println("Digite o nome do estágiario: ");
                        String nome = st.nextLine();
                        System.out.println("Digite a carga Horária: ");
                        int cargaHoraria = it.nextInt();
                        Estagiario e = new Estagiario(nome);
                        e.cargaHoraria(cargaHoraria);
                        System.out.println("===================================================");
                        System.out.println("Nome: " + nome + " Salário: " + e.obtemSalario());
                        tamanhoArray = colaboradores.length;
                                            colaboradores[i][j] = nome;
                                            
                                        
                                            colaboradores[i][j] = String.valueOf(e.obtemSalario());
                                            
                                        
                                            colaboradores[i][j] = "Estágiario";
                                         

                        }
                        System.out.println("===================================================");
                        System.out.println("Cadastrado com sucesso!\nDeseja continuar? 1 - Sim 3 - Não");
                        opcao = it.nextInt();
                    break;
                    case 2:
                        System.out.println("Digite o nome do Funcionário: ");
                        String nomeFuncionario = st.nextLine();
                        System.out.println("Digite a carga Horária: ");
                        int cargaHorariaFuncionario = it.nextInt();
                        Funcionario f = new Funcionario(nomeFuncionario);
                        f.cargaHoraria(cargaHorariaFuncionario);
                        System.out.println("===================================================");
                        System.out.println("Nome: " + nomeFuncionario + " Salário: " + f.obtemSalario());
                        for(int i = 0; i < 100; i++){
                            for(int j = 0; j < 3; j++){
                                if(colaboradores[i][j] == null){
                                    switch (j) {
                                        case 0:
                                            colaboradores[i][j] = nomeFuncionario;
                                            break;
                                        case 1:
                                            colaboradores[i][j] = String.valueOf(f.obtemSalario());
                                            break;
                                        default:
                                            colaboradores[i][j] = "Funcionário";
                                            break;
                                    }
                                }
                            }

                        }
                        System.out.println("===================================================");
                        System.out.println("Cadastrado com sucesso!\nDeseja continuar? 1 - Sim 3 - Não");
                        opcao = it.nextInt();
                    break;
                    case 3:
                        System.out.println("Digite o nome do Professor Técnico: ");
                        String nomePT = st.nextLine();
                        System.out.println("Digite a carga Horária: ");
                        int cargaHorariaPT = it.nextInt();
                        System.out.println("Digite a Titulação: 1 - Graduacão 2 - Mestrado 3 - Doutorado");
                        int titulacaoPT = it.nextInt();
                        ProfessorTecnico PT = new ProfessorTecnico(nomePT);
                        PT.cargaHoraria(cargaHorariaPT);
                        if(titulacaoPT == 1){ titulacaoPT = 0; }else if(titulacaoPT == 2){ titulacaoPT = 20;}else{ titulacaoPT = 50; }
                        PT.obtemTitulacao(titulacaoPT);
                        System.out.println("===================================================");
                        System.out.println("Nome: " + nomePT + " Salário: " + PT.obtemSalario());
                        for(int i = 0; i < 100; i++){
                            for(int j = 0; j < 3; j++){
                                if(colaboradores[i][j] == null){
                                    switch (j) {
                                        case 0:
                                            colaboradores[i][j] = nomePT;
                                            break;
                                        case 1:
                                            colaboradores[i][j] = String.valueOf(PT.obtemSalario());
                                            break;
                                        default:
                                            colaboradores[i][j] = "Professor técnico";
                                            break;
                                    }
                                }
                            }

                        }
                        System.out.println("===================================================");
                        System.out.println("Cadastrado com sucesso!\nDeseja continuar? 1 - Sim 3 - Não");
                        opcao = it.nextInt();
                    break;
                    case 4:
                        System.out.println("Digite o nome do Professor de Graduação: ");
                        String nomePG = st.nextLine();
                        System.out.println("Digite a carga Horária: ");
                        int cargaHorariaPG = it.nextInt();
                        System.out.println("Digite a Titulação: 1 - Graduacão 2 - Mestrado 3 - Doutorado");
                        int titulacaoPG = it.nextInt();
                        ProfessorGraduacao PG = new ProfessorGraduacao(nomePG);
                        PG.cargaHoraria(cargaHorariaPG);
                        if(titulacaoPG == 1){ titulacaoPG = 0; }else if(titulacaoPG == 2){ titulacaoPG = 20;}else{ titulacaoPG = 50; }
                        PG.obtemTitulacao(titulacaoPG);
                        System.out.println("===================================================");
                        System.out.println("Nome: " + nomePG + " Salário: " + PG.obtemSalario());
                        for(int i = 0; i < 100; i++){
                            for(int j = 0; j < 3; j++){
                                if(colaboradores[i][j] == null){
                                    switch (j) {
                                        case 0:
                                            colaboradores[i][j] = nomePG;
                                            break;
                                        case 1:
                                            colaboradores[i][j] = String.valueOf(PG.obtemSalario());
                                            break;
                                        default:
                                            colaboradores[i][j] = "Professor De Graduação";
                                            break;
                                    }
                                }
                            }

                        }
                        System.out.println("===================================================");
                        System.out.println("Cadastrado com sucesso!\nDeseja continuar? 1 - Sim 3 - Não");
                        opcao = it.nextInt();
                    break;
                    default:
                        opcao = 3;
                }
            }else if(opcao == 2){
                for(String[] col : colaboradores){
                    System.out.println(Arrays.toString(col));
                }
            }else{
                opcao = 3;
            }
            
    //        Estagiario bruno = new Estagiario("Bruno");
    //        bruno.cargaHoraria(8);
    //        System.out.println(bruno.obtemSalario());
    //        Funcionario fabricio = new Funcionario("Fabricio");
    //        fabricio.cargaHoraria(10);
    //        System.out.println(fabricio.obtemSalario());
    //        ProfessorTecnico marcelo = new ProfessorTecnico("Marcelo");
    //        marcelo.cargaHoraria(10);
    //        marcelo.obtemTitulacao(20);
    //        System.out.println(marcelo.obtemSalario());
    //        ProfessorGraduacao salvador = new ProfessorGraduacao("Salvador");
    //        salvador.cargaHoraria(10);
    //        salvador.obtemTitulacao(20);
    //        System.out.println(salvador.obtemSalario());
        }while(opcao != 3);
        
        
        
        
    }
}
