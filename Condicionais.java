package condicionais;
import java.util.*;

public class Condicionais{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int n1,n2;
        System.out.println("Digite sua primeria nota: ");
        n1 = (int) (teclado.nextInt());
        System.out.println("Digite sua segunda nota: ");
        n2 = (int) (teclado.nextInt()); 
        float m = (n1+n2)/2;
        System.out.println("Sua nota foi de -> "+m);
        if (m>=7){
            System.out.println("Você foi aprovado");
        } else{
            System.out.println("Você foi reprovado!");
        }
        
    }
}