/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecao.customException.classes;

/**
 *
 * @author bruno.graciano
 */
public class LoginInvalidoException extends Exception{
    public LoginInvalidoException(){
        super("Usuário ou senha inválidos");
    }
}
