/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.test;
import java.util.Scanner;
import Sistema.classes.Sistema;
/**
 *
 * @author bruno.graciano
 */
public class SistemaTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sString = new Scanner(System.in);
        Sistema sistema = new Sistema();
        String continuar = "N";
        System.out.println("Bem Vindo ao Banco Real");
        do{
        System.out.println("Qual a opção que você deseja?");
        System.out.print("1 : Depositar\n2 : Saque\n3 : Extrato\n4 : Pedir Cartão\n9 : Cancelar");
        int opcao = s.nextInt();
        switch(opcao){
        
            case 1 : 
                System.out.println("Digite o valor a depositar: ");
                float valorDeposito = s.nextFloat();
                System.out.println(sistema.deposito(valorDeposito));
                System.out.println("Deseja continuar? S/N");
                continuar = sString.nextLine().toUpperCase();
            break;
            case 2 :
                System.out.println("Digite o valor a sacar: ");
                float valorSaque = s.nextFloat();
                System.out.println(valorSaque > sistema.extrato() ? "Você não pode sacar um valor maior do que está na sua conta" : sistema.saque(valorSaque));
                System.out.println("Deseja continuar? S/N");
                    continuar = sString.nextLine().toUpperCase();
            break;
            case 3 :
                // Extrato
                System.out.println(sistema.extrato());
                System.out.println("Deseja continuar? S/N");
                continuar = sString.nextLine().toUpperCase();
                
            break;
            case 4 :
                // Pedir cartão
                System.out.println(sistema.pedirCartao());
                System.out.println("Deseja continuar? S/N");
                continuar = sString.nextLine().toUpperCase();
                
                
            break;
            case 9 : 
                continuar = "N";
            break;
            default :
                System.out.println("Escolha uma opção");
                continuar = "S";
        }
        }while("S".equals(continuar));
        System.out.println("Sessão finalizada com sucesso!");
            
    }
}
