/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecao.checkedExceptionTest;

import Excecao.checkedException.classes.Funcionario;
import Excecao.checkedException.classes.Pessoa;
import Excecao.customException.classes.LoginInvalidoException;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bruno.graciano
 */
public class SobrescritaComExceptionsTest {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Pessoa p = new Pessoa();
//        try {
//            f.salvar();
//        } catch (LoginInvalidoException ex) {
//            Logger.getLogger(SobrescritaComExceptionsTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
