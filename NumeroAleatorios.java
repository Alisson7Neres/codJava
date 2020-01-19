package teste.Teste;

import java.security.SecureRandom;
import java.util.Scanner;

public class NumeroAleatorios {
	private enum Resultado {ACERTOU, ERROU};
	public static void main(String[] args) {
		while (true) {
			try {
				// Criando objeto da classe SecureRandom
				SecureRandom aleatorio = new SecureRandom();
				// Colocando limite de 5 números começando com número 1 (1 + 0)
				int SecureRandom = 1 + aleatorio.nextInt(5);
				// Criando objeto da classe Scanner para receber entrada de dados
				Scanner input = new Scanner(System.in);
				System.out.print("Digite um número de 1 a 5 ");
				// A variável tcl irá receber o objeto de entrada de dados input que irá receber números
				// inteiros nextInt()
				int tcl = input.nextInt();
				System.out.println("Para sair digite 0");
				// Se a entrada de dados recebida é igual ao número randomico SecureRandom
				if(tcl == SecureRandom) {
					System.out.println(Resultado.ACERTOU + " "+SecureRandom);
					System.out.println("############################");
				} else {
					System.out.println(Resultado.ERROU + " " +SecureRandom);
					System.out.println("############################");
				} if(tcl == 0) {
					System.out.println("Programa finalizado");
					System.exit(0);
					// Irá finalizar a entrada de dados
					input.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
