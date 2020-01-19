package teste.Teste;

import java.util.Arrays;

public class ArrayMulltidimensional {
	public static void main(String[] args) {
		// Array multidimensional com 3 linhas e 3 colunas
		int[][] arrayM = { { 1, 2, 3 }, { 6, 5, 4 } };
		System.out.println("Array multidimensional");
		outputArray(arrayM);
		procura(arrayM);
	}
	// Método que irá percorre o arrayM
	public static void outputArray(int array[][]) {
		for (int linha = 0; linha < array.length; linha++) {
			for (int coluna = 0; coluna < array[linha].length; coluna++) 
				System.out.printf("%d ", array[linha][coluna]);
				System.out.println();
		}
	}
	public static void procura(int array[][]) {
		Arrays.binarySearch(array, 5); // Irá ignorar o índice 5
	}
}
