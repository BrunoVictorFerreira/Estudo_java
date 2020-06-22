/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecao.checkedExceptionTest;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author bruno.graciano
 */
public class checkedExceptionTest {
    public static void main(String[] args) {
       
        abrirArquivo();
       
    }
    public static void criarArquivo() throws IOException{
        File file = new File("Teste.txt");
        try{
            System.out.println("Arquivo criado?" + file.createNewFile());
            System.out.println("Arquivo criado");
            
        }catch(IOException e){
            e.printStackTrace();
            throw e;
        }
    }
    public static String abrirArquivo(){

        try{
            System.out.println("Abrindo um arquivo");
            System.out.println("Executando a leitura do arquivo");
//            throw new Exception();
            System.out.println("Escrevendo no arquivo");
            return "Valor";
           
            
        }catch(Exception e){
            System.out.println("Dentro do catch");
            e.printStackTrace();
            
        }finally{
            System.out.println("Fechar o arquivo");
        }
        return null;
    }
}
