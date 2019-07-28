
package pkgswitch;
import java.util.*;
public class Escolha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dado;
        System.out.print("Digite o número de pernas ");
        dado = (int) (teclado.nextInt());
        
        switch(dado){
            case 1:
                System.out.println("Saci");
                break;
            case 2:
                System.out.println("Bípede");
                break;
            case 4 :
                System.out.println("Quadrúpede");
                break;
            case 6:
                System.out.println("Aracnídeo");
                break;
            case 8:
                System.out.println("Aracnídeo");
                break;
            default:
                System.out.println("ET");
        }
    }
    
}
