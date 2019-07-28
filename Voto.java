
package voto;
import java.util.*;

public class Voto {
    public static void main(String[] args) {
        int nasc;
        System.out.print("Ano de nascimento: ");
        Scanner teclado = new Scanner(System.in);
        nasc = (int) (teclado.nextInt());
        int age = 2019 - nasc;
        System.out.println("Sua idade -> " + age);
        
        if(age < 16){
            System.out.println("Não vota");
        }
        if(age >16 || age == 70){
            System.out.println("Voto obrigatório");
        }if(age == 16 || age == 17 || age > 70){
            System.out.println("Opcional!");
        }
    }
    
}
