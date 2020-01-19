package teste.Teste;

import java.util.ArrayList;
import java.util.List;

public class ListaExecutavel {
	public static void main(String[] args) {
		// Criando uma List
		List<String> hardware = new ArrayList<String>();
		// Preenchendo a lista
		hardware.add("Placa mãe");
		hardware.add("Processador");
		hardware.add("Memoria RAM");
		hardware.add("Placa de vídeo");
		
		// Percorrendo a lista com FOR EACH
		for (String componentes : hardware) {
			System.out.println(componentes);
		}
	}

}
