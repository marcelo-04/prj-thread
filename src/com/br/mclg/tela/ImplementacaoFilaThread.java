package com.br.mclg.tela;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objFilaThread) {
		pilha_fila.add(objFilaThread);
	}

	@Override
	public void run() {

		System.out.println("Fila rodando!!!");
		
		while (true) {
			
			synchronized (pilha_fila) { 
				// bloquea o acesso desta lista por outro processo
				Iterator iteracao = pilha_fila.iterator();
				while (iteracao.hasNext()) { // enquanto conter dados na lista irá processar
					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();// pega o objeto atual

					System.out.println("==========================================");
					System.out.println(processar.getEmail());
					System.out.println(processar.getNome());

					iteracao.remove();

					try {
						Thread.sleep(1000);// dar um tempo pra descarga de memória
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			try {
				Thread.sleep(1000);// processa toda a lista e, da um tempo pra limpeza de memória
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
