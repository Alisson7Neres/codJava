package teste.Teste;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class NumerosLongos {
	static BigDecimal produto =  BigDecimal.valueOf(1.287);
	static BigDecimal juros =  BigDecimal.valueOf(0.5);
	public static void main (String[] args) {
		System.out.println("Monitor ultrawide 29 polegadas Samsung " + produto + " 12x c/juros");
		System.out.println("Juros do produto depois de um mês de atraso na parcela");
		for(int mes = 1; mes <=10; mes++) {
			// calcula nova quantidade durante mes especificado
			BigDecimal amount =
			produto.multiply(juros.add(BigDecimal.ONE).pow(mes));
			System.out.printf("%d%15s%n",mes, NumberFormat.getCurrencyInstance().format(amount));
		}
	}
}
