/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FACOM;

/**
 *
 * @author bruno.graciano
 */
public class Agenda{
    Pessoa[] pessoas = new Pessoa[10];
    
    public void armazenaPessoa(String nome, String idade, float altura){
        Pessoa p = new Pessoa(nome, idade, altura);
        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i] == null){
                pessoas[i] = p;
                break;
            }
        }
        System.out.println(pessoas.length);
    }
    
    public void removePessoa(String nome){
    
    }
    public int buscaPessoa(String nome){
        return 1;
    }
    public void imprimeAgenda(){
        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa.getNome());
        }
    }
    public void imprimePessoa(int index){
        
    }
}
