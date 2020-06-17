/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadorestatico.classes;


/**
 *
 * @author bruno.graciano
 */
public class Cliente {
    private static int[] parcelas;
    {
        System.out.println("Bloco inicializacao Não estatico");
    }
    static {
        parcelas = new int[100];
        System.out.println("Dentro bloc estatico");
        for(int i = 1; i <= 100; i++){
            parcelas[i-1] = i;
        }
    }
    public Cliente(){
        System.out.println("Dentro do construct");
//        for(int parcela : Cliente.parcelas){
//            System.out.print(parcela + " ");
//        }
    }
    
    public static int[] getParcelas() { return parcelas; }

    
}
