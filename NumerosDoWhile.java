package numerosdowhile;
import java.util.Scanner;
public class NumerosDoWhile {
    public static void main(String[] args) {
        int n,s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.print("Digite um número: ");
            n = (int) (teclado.nextInt());
            s += n;
            System.out.print("Deseja continuar? [S/N] ");
           resp = teclado.next();
        }while (resp.equals("S"));
        System.out.println("Soma dos números digitados -> "+s);
    }
    
}
