package com.br.mclg.thread;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		/*Código da rotina para execução em paralelo*/
		for (int posicao = 0; posicao < 10; posicao++) {
			
			Thread.sleep(1000);//dá um tempo
			
			//executando esse envio com um tempo de parada ou tempo determinado.
			System.out.println("Executando uma rotina, envio de e-mail.");
		}
		System.out.println("Fim do processo de teste de Thread!!!");
	}

}
