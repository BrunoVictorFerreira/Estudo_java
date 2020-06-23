/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assertions.test;

/**
 *
 * @author bruno.graciano
 */
public class assertionsTest {
    public static void main(String[] args) {
        diasDaSemana(10);
    }
    
    private static void calculaSalario(double salario){
        assert (salario > 0) : "O salário tem que ser positivo, o salario veio: " + salario;
        
    }
    
    private static void diasDaSemana(int dia){
        switch(dia){
            case 1:
                
            break;
            case 2:
                
            break;
            case 3:
                
            break;
            case 4:
                
            break;
            case 5:
                
            break;
            case 6:
                
            break;
            case 7:
                
            break;
            default:
                assert false;
        }
    }
}
