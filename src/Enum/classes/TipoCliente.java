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
public enum TipoCliente {
    //CORPO ESPECÍFICO = quando você quer sobrescrever alguma constante do enum
    PESSOA_FISICA(1, "Pessoa física"), PESSOA_JURIDICA(2, "Pessoa Jurídica"){
        public String getId(){
            return "B";
        }
    };

    private int tipo;
    private String nome;
    
    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getId(){
        return "A";
    }
    
    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
    
}
