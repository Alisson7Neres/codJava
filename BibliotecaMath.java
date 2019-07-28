package bibliotecamath;
import java.util.*;

public class BibliotecaMath{
    public static void main (String[] args){
        System.out.println("Raíz quadrada sintaxe\nMath.sqrt() = A raíz quadrade de 10 é: " + Math.sqrt(10));
        System.out.println("A raíz cúbica sintaxe\nMath.cbrt() = A raíz cúbica de 10 é: " + Math.cbrt(10));
        System.out.println("O expoente sintaxe\nMath.exp() = O expoente de 10 é: " + Math.exp(10));
        System.out.println("A potência sintaxe\nMath.pow(n1,n2) = A potência de 10² é: " + Math.pow(10, 2));
        System.out.println("");
        System.out.println("Para arrendonda um número usa-se o Math.abs.\nPara arrendonda um número para baixo usa-se o Math.floor, ele também tira a parte decimal do número.\nPara arrendonda para cima usa-se o ceil.\nPara arrendonda um número aritmeticamente usa-se o roud.");
        System.out.println("Pegar um número aleátorio usa o comando Math.random() qu irá gerar número de 0 à 1");
        System.out.print("Para pegar qualquer número ussa se\ndouble aleatorio = Math.random(); int n1 = (int) 5 + aleatorio (10-5) = ");
        double aleatorio = Math.random();
        int n1 = (int) (5 + aleatorio * (10-5));
        System.out.println(n1);
    }
}
