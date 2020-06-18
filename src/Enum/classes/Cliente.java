/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum.classes;

/**
 *
 * @author bruno.graciano
 */
public class Cliente {
    public enum TipoPagamento {
        AVISTA, APRAZO
    }
    
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;
    
    public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipo;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " Tipo cliente: " + this.tipoCliente.getNome() + " Tipo do pagamento: " + this.tipoPagamento + " número: " + this.tipoCliente.getTipo();
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipo() {
        return tipoCliente;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipoCliente = tipo;
    }
    
    

}
