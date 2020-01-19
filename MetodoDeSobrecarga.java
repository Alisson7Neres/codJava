package teste.Teste;

public class MetodoDeSobrecarga {
	public static void main(String[] args) {
		try {
			System.out.println("Raíz quadrada de 7 com int " + square(7));
			System.out.println("Raíz quadrada de 7.5 com double " + square(7.5));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	// Criando métodos de sobrecarga
	public static int square(int intValue) {
		
		return intValue * intValue;
	}
	public static double square(double doubleValue) {
		return doubleValue * doubleValue;
	}
	// Métodos de sobrecarga devem ter tipos diferentes 
}
