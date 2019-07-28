package exerciciorepita;
import javax.swing.JOptionPane; //Biblioteca que contém janelas prontas.
public class ExercicioRepita {
    public static void main(String[] args) {
       // JOptionPane.showMessageDialog(null,"Olá mundo","bem vindo", JOptionPane.INFORMATION_MESSAGE); // Comando irá mostrar uma janela pronta
       //int n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número"));//Janela com interação
       //JOptionPane.showMessageDialog(null,"Você digitou o número-> "+n1);
       int n1 = 0;
       do{
           n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número"));
           JOptionPane.showMessageDialog(null,"Você digitou o número -> "+n1 +"\nPara sair do software digite o número 0");
       }while(n1 != 0);
    }
    
}
