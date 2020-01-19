package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaDeThread {
	public static void main(String[] args) throws InterruptedException {
		Thread notaEmail = new Thread(thread1);
		notaEmail.start();
		
		new Thread(){
			// executa os comandos
			public void run() {
			for(int notaFiscal = 1; notaFiscal <=10; notaFiscal++) {
			// Thread Sleep irá acrescentar tempo de espera para próxima instrução
			// 1000 = 1 segundo 2000 = 2 segundos 10000 = 10 segundos de espera
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Nota fiscal sendo enviado " + notaFiscal);
				}
			}
		}.start(); // liga a thread que fica processando paralelamente
		JOptionPane.showMessageDialog(null, "Executando código paralelamente");
		
	}
	
	private static Runnable thread1 = new  Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int notaEmail = 1; notaEmail <=10; notaEmail++) {
				// Thread Sleep irá acrescentar tempo de espera para próxima instrução
				// 1000 = 1 segundo 2000 = 2 segundos 10000 = 10 segundos de espera
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Email sendo enviado " + notaEmail);
					}
			
		}
	};

}
