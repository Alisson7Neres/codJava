package operadosUnarios;

public class cursoemvideos07{
    public static void main(String[] args){
        int a = 10;
        int incremento = 2;
        System.out.println("Incremento vale: " + incremento);
        int posIncremento = a + incremento++;
        int preIncremento = a + ++incremento;
        System.out.println("Número antes do pós incremento: " + a);
        System.out.println("Número após o incremento: " + posIncremento);
        System.out.println("Número pré incremento: " + preIncremento);
        System.out.println("\n\n");
        int decremento = 2;
        System.out.println("Decremento vale: " + decremento);
        int posDecremento = a - decremento--;
        int preDecremento = a - --decremento;
        System.out.println("Número antes do pós decremento: " + a);
        System.out.println("Número após o decremento: " + posDecremento);
        System.out.println("Número pré decremento: " + preDecremento);
        
    }
}

