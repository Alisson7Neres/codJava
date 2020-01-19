package teste.Teste;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Notas
{
	public static void main(String[] args) {
		try {
	int[] notas = new int[400];
	Scanner output = new Scanner(System.in);

	    System.out.print("Análise e desenvolvimento de sistemas " );
	    int ads = output.nextInt();
	    notas[0] += ads;
	    
	    System.out.print("Enterprise Resource Planning " );
	    int erp = output.nextInt();
	    notas[1] = erp;
	    
	    System.out.print("Sistema da informação " );
	    int sdi = output.nextInt();
	    notas[2] = sdi;
	    
	    System.out.print("Java SE " );
	    int jse = output.nextInt();
	    notas[3] = jse;
	    
	    System.out.print("JavaScript " );
	    int js = output.nextInt();
	    notas[4] = js;
	    
	    JOptionPane.showMessageDialog(null,"Análise e desenvolvimento de sistemas " + notas[0]
	    + "\nEnterprise Resource Planning " + notas[1] + "\nSistema da informação "+ notas[2] 
	    + "\nJava SE " + notas[3] + "\nJavaScript " +notas[4]);
	       output.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
