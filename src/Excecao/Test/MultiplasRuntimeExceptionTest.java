/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecao.Test;

import java.io.*;
import java.sql.SQLException;

/**
 *
 * @author bruno.graciano
 */
public class MultiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        try{
            talvezLanceException();
        }catch(SQLException | IOException e){
            e.printStackTrace();
        }
    }
    
    private static void talvezLanceException() throws SQLException , FileNotFoundException{
        
    }
}
