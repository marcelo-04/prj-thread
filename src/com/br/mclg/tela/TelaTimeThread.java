package com.br.mclg.tela;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {
	
	//Executa o que tiver dentro no momneto da abertura ou execu��o.
	public TelaTimeThread() {
		// Primeira parte conclu�da
		setTitle("Tela de Time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		// esse comando torna a tela vis�vel para o usu�rio.
		setVisible(true);
		
	}
}
