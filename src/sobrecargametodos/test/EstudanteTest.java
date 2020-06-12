/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargametodos.test;
import sobrecargametodos.classes.Estudante;
/**
 *
 * @author bruno.graciano
 */
public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("12121", "Bruno", "13-04-2016", new double[]{5,7,9});
        estudante.imprime();
    }
}
