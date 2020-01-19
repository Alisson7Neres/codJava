package teste.Teste;
import java.util.ArrayList;
import java.util.Scanner;
public class Lista2 {
	static ArrayList<Integer> notas = new ArrayList<Integer>();
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		try{
			
		System.out.println("Digite três notas para a lista ");
		for(int cont = 0; cont < 3; cont++) {
			
		int entrada = input.nextInt();
		notas.add(entrada);
		}
		System.out.println(notas);
		input.close();
		}catch(Exception erro) {
			erro.printStackTrace();
		}
	}

}
