/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.classes;
import java.util.Scanner;
/**
 *
 * @author bruno.graciano
 */
public class Sistema {
    private float valorTotal = 0;
    Scanner s = new Scanner(System.in);
    Scanner sInt = new Scanner(System.in);
    public Sistema(float valorTotal){
        this.valorTotal = valorTotal;
    }
    
    public Sistema(){
    
    }
    
    public void setValorTotal(float valorTotal){
        this.valorTotal = valorTotal;
    }

    public float extrato(){
        return this.valorTotal;
    }
    public String pedirCartao(){
        System.out.println("Qual o seu nome: ");
        String nome = s.nextLine();
        System.out.println("Qual sua data de nascimento: ");
        int dataNascimento = sInt.nextInt();
        return "Parabéns " + nome + "\nSeu cartão foi criado com sucesso!";
    }
    public String deposito(float valorDeposito){
        this.valorTotal += valorDeposito;
        return "Depósito efetuado com sucesso!" + "\\Valor total: " + this.valorTotal;
    }
    public String saque(float valorSaque){
        this.valorTotal -= valorSaque;
        return "Saque efetuado com sucesso!" + "\nValor total: " + this.valorTotal;
    }
    
    
}
