/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recebendo.dados;

import java.util.Scanner; // Irá receber dados do teclado

/**
 *
 * @author alisson
 */
public class RecebendoDados {

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args){
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in); //  Criando objetos para receber entrada de dados
        System.out.print("Digite o nome do aluno: ");
        String nome = (String) (teclado.nextLine()); // Criando entrada para receber tipo String
        System.out.printf("Digite o RU do aluno ");
        int RU = (int) (teclado.nextInt()); // Criando entrada para receber tipo Int
        
        System.out.printf("\n"+"O nome do aluno %s e o número da RU %d\n", nome, RU);
        
        
    }
    
}
