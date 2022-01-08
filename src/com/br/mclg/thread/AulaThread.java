package com.br.mclg.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		// Thread em processamento em paralelo do envio de email
		new Thread() {

			public void run() {

				// C�digo da rotina para execu��o em paralelo
				for (int posicao = 0; posicao < 10; posicao++) {

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} // d� um tempo

					// executando esse envio com um tempo de parada ou tempo determinado.
					System.out.println("Executando uma rotina, envio de e-mail.");
				}
				// Fim do c�digo em paralelo
			}
		}.start();// Start liga a thread que fica processando paralelamente por tr�s.

		/*********************** DIVIS�O DAS THREADS ***********************/

		// Thread em processamento em paralelo do envio de nota fiscal
		new Thread() {

			public void run() {

				// C�digo da rotina para execu��o em paralelo 
				for (int i = 0; i < 10; i++) {

					// Quero excutar ess envio com tempo de parada, ou com tempo determinado
					System.out.println("Executando alguma rotina, por exemplo envio de nota fiscal!");
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} // Tempo da thread

				}
				// Fim do c�digo em paralelo 

			};
		}.start();// Start liga a thread que fica processando paralelamente
		
		// C�digo do sistema do usu�rio continua o fluxo de trabalho
		System.out.println("FIM DA EXECU��O DA THREAD!!!");
		// Fluxo do sistema, cadastro de venda, uma emiss�o de nota fiscal
		JOptionPane.showMessageDialog(null, "Sistema em execu��o para o usu�rio.");
	}
}
