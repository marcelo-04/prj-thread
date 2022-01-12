package com.br.mclg.tela;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	
	// Painel de componentes
	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	private JLabel hora = new JLabel("Time Thread 1");
	private JTextField tempo = new JTextField();
	
	private JLabel hora2 = new JLabel("Time Thread 2");
	private JTextField tempo2 = new JTextField();
	
	//Executa o que tiver dentro no momneto da abertura ou execução.
	public TelaTimeThread() {
		// Primeira parte concluída
		setTitle("Tela de Time com Thread");
		setSize(new Dimension(200, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		// Controlador de posicionamento de componentes
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		
		hora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(hora, gridBagConstraints);
		
		tempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(tempo, gridBagConstraints);
		
		hora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(hora2, gridBagConstraints);
		
		tempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(tempo2, gridBagConstraints);
		
		add(jPanel, BorderLayout.WEST);
		// esse comando torna a tela visível para o usuário.
		setVisible(true);
		
	}
}
