/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecao.customException.classes;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bruno.graciano
 */
public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException ex) {
            ex.printStackTrace();
        }
    }
    
    private static void logar()throws LoginInvalidoException{
        
        String usuarioBancoDeDados = "Goku";
        String senhaBancoDeDados = "111";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "123";
        
        if(!usuarioDigitado.equals(usuarioBancoDeDados) || !senhaBancoDeDados.equals(senhaDigitada)){
            throw new LoginInvalidoException();
        }else{
            System.out.println("Logado");
        }
    }
}
