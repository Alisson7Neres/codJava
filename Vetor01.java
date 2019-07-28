package vetor01;

import java.util.Arrays;

public class Vetor01 {
    public static void main(String[] args) {
    int vet[] = {3,5,8,2};
    for(int c=0;c<vet.length;c++){
        System.out.print(vet[c]);
    }
    System.out.print("\n");
    int vet2[] = {8,10,60,75};
    Arrays.sort(vet); //Organizara o vetor em ordem
    for(int vetor: vet2){
        System.out.print(vetor+" ");
    }
    int vet3[]= {8,6,7,9,5,4};
    //Arrays.sort(vet3);
    int b = Arrays.binarySearch(vet3, 3);
    System.out.println("\nPosição do vetor -> " + b);
    
    int vet4[] = new int[20];
    Arrays.fill(vet4,0);//Preenche todos os índices do vetor
    for(int mostrar: vet4){
        System.out.print(mostrar + " ");
    }
    }
}
