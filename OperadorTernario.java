package operadorternario;
import java.util.*;
public class OperadorTernario {
    public static void main(String[] args) {
        int maior,menor,dado,dado2;
        System.out.println("Digite dois números: ");
        Scanner teclado = new Scanner(System.in);
        dado = (int) (teclado.nextInt());
        dado2 = (int) (teclado.nextInt());
        maior = dado>dado2 ? dado:dado2;
        menor = dado<dado2 ? dado:dado2;
        System.out.println("O maior número foi: " + maior);
        System.out.println("O menor número foi: " + menor);
        
        String nome1 = "Alisson";
        String nome2 = "Alisson";
        String nome3 = new String ("Alisson");
        String res;
        res = nome1==nome2 ? "igual":"diferente"; // O operador == irá comparar o centeúdo"
        System.out.println(res);
        res = nome1==nome3 ? "igual":"diferente";
        System.out.println(res);
        res = nome1.equals(nome3) ? "igual":"diferente"; // o Comando .equals irá comparar o objeto.
        System.out.println(res);
    }
    
}
