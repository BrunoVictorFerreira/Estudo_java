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
public class Carro {
    public static final double VELOCIDADE_FINAL = 250;
    public final Comprador comprador = new Comprador();
    private String nome;
    private String marca;
    
    @Override
    public String toString() {
        return "Carro{" + "nome=" + nome + ", marca=" + marca + '}';
    }

    public final void imprime(){
        System.out.println("imprimindo CARRO");
    }
    
    public Comprador getComprador() {
        return comprador;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
