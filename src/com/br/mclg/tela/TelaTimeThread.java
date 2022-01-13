package com.br.mclg.tela;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {

	// Painel de componentes
	private JPanel jPanel = new JPanel(new GridBagLayout());

	private JLabel hora = new JLabel("Nome");
	private JTextField tempo = new JTextField();

	private JLabel hora2 = new JLabel("E-mail");
	private JTextField tempo2 = new JTextField();

	private JButton jButton = new JButton("Gerar");
	private JButton jButton2 = new JButton("Stop");
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

	// Executa o que tiver dentro no momneto da abertura ou execução.
	public TelaTimeThread() {
		// Primeira parte concluída
		setTitle("Tela de Time com Thread");
		setSize(new Dimension(240, 270));
		setLocationRelativeTo(null);
		setResizable(false);

		// Controlador de posicionamento de componentes
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;

		hora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(hora, gridBagConstraints);

		tempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(tempo, gridBagConstraints);

		hora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(hora2, gridBagConstraints);

		tempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(tempo2, gridBagConstraints);

		// *******************************************

		gridBagConstraints.gridwidth = 1;

		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(jButton, gridBagConstraints);

		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(jButton2, gridBagConstraints);

		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				
				// simulando 100 envios em massa
				for (int quantidade = 0; quantidade < 100; quantidade++) {
				
					ObjetoFilaThread filaThread = new ObjetoFilaThread();
					filaThread.setNome(tempo.getText());
					filaThread.setEmail(tempo2.getText()+ " = "+ quantidade);
					
					fila.add(filaThread);
				}
			}
		});

		jButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fila.stop();
				fila = null;
			}
		});
		
		fila.start();
		
		add(jPanel, BorderLayout.WEST);
		// esse comando torna a tela visível para o usuário.
		setVisible(true);
	}
}
