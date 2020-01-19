package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

// A classe JDialog possibilita a criação de janelas gráficas
public class TelaTimeThread extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout());
	private JLabel mostrarHora = new JLabel("Nome ");
	private JLabel mostrarHora2 = new JLabel("Email ");
	private JTextField mostrarTempo = new JTextField();
	private JTextField mostrarTempo2 = new JTextField();
	private JButton jButton = new JButton("add lista");
	private JButton jButton2 = new JButton("Stop");
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
	// Construtor
	public TelaTimeThread () {
		// Título 
		setTitle("Tela criada com a classe JDialog");
		// Dimensão
		setSize(new Dimension(300,250));
		// Rederencionamento (false)
		setResizable(false);
		// Localização do app null = centro
		setLocationRelativeTo(null);
		// COntrolador de posicionamento de componentes
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 5, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;

		mostrarHora.setPreferredSize(new Dimension (200,25));
		jPanel.add(mostrarHora, gridBagConstraints);
		
		add(jPanel,BorderLayout.WEST);
		
		mostrarTempo.setPreferredSize(new Dimension(200,25));
		// Vai andar uma posição
		gridBagConstraints.gridy ++;
		jPanel.add(mostrarTempo, gridBagConstraints );
		
		mostrarHora2.setPreferredSize(new Dimension (200,25));
		gridBagConstraints.gridy ++;
		jPanel.add(mostrarHora2, gridBagConstraints);
		
		mostrarTempo2.setPreferredSize(new Dimension (200,25));
		gridBagConstraints.gridy ++;
		jPanel.add(mostrarTempo2, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;
		
		jButton.setPreferredSize(new Dimension(80,25));
		gridBagConstraints.gridy++;
		jPanel.add(jButton, gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension (80,25));
		gridBagConstraints.gridx++;
		jPanel.add(jButton2, gridBagConstraints);
		
		jButton.addActionListener(new ActionListener() {
			//Executa o clique no jButton
			@Override
			public void actionPerformed(ActionEvent e) {
			if(fila == null) {
				fila = new ImplementacaoFilaThread();
				fila.start();
			}
				for(int qtd = 0; qtd < 100; qtd++) { // simulando 100 envios em massa
				ObjetoFilaThread filaThread = new ObjetoFilaThread();
				filaThread.setNome(mostrarTempo.getText());
				filaThread.setEmail(mostrarTempo2.getText() + " - " + qtd);
				
				fila.add(filaThread);
			}
			}
		});
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ObjetoFilaThread paraThread = new ObjetoFilaThread();
				fila.stop();
				fila = null;
				System.out.println("\n ------------Parando a fila------------");
			}
		});
		JPanel painelHora = new JPanel();
		

		fila.start();
		// O setVisible sempre será o último comando
		setVisible(true);
	}
	
}
