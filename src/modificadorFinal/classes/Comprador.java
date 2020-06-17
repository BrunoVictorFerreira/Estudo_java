/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadorFinal.classes;

/**
 *
 * @author bruno.graciano
 */
public class Comprador {
    private String nome;

    @Override
    public String toString() {
        return "Comprador{" + "nome=" + nome + '}';
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
