# prj-thread
## Curso de Java Web Full-Stack - Iniciando com as Threads.

O objetivos das Threads são processamento paralelos de dados e liberar 
o usuário para continuar sua tarefa.<br>
O uso da threads entra em ação quando precisamos ler informação de forma invisível, 
notificar o usuário, quando temos um processo lento e demorado.<br>
As Threads estão presente em nossa vida a todo momento, por exemplo vários aplicativos no 
smartphone mostrando notificação de e-mail, mensagens, navegador com várias abas e etc.

## Objeto e o Runnable
Diminuindo o código e trabalhando com objetos manipuláveis usando Runnable.

## Criando um tela Gráfica com JDialog
Para interação do usuário, usando o swing.

## Aplicação Desktop com a Thread
Trabalhando com GridBagConstraints gerenciador de posicionamento e layout.<br>
Foram adicionando os botões JButton, e o alinhamento dos mesmos e desabilitado os labels dos campos das Threads.<br>
Controlando a Thread 1 com Start e Stop, foi feita a declaração global para acessar todos os campos das threads.<br>
Controlando a Thread 2 com Start e Stop, na thread 2 teve uma intenção de criar uma lógica, tirando objeções para tirar 
dúvidas de trabalhar com outra thread. Foi habilitado e desabilitado os botões Start e Stop para interação.

## Criando a Fila e Pilha para processar em paralelo em Thread
Foram criadas duas classe ObjetoFilaThread ImplementacaoFilaThread para modificação da tela gráfica.<br>
Criando a classe ObjetoFilaThread que é uma thread, para isso foi criado um método para adicionar pilha ou fila, adicionei 
a classe ConcurrentLinkedQueue para uma thread concurrent, também foi craido o método run(), para o processo interagir com 
lista, enquanto tiver dados pega o objetoFilaThread da lista atual para processar alguma coisa, terminou remove e dar um 
tempo pra descarga de memória.
