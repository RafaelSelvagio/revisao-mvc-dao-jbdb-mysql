package main;

import java.util.Scanner;

import controller.TarefaController;
import model.Tarefa;

public class Main {

	public static void main(String[] args) {
		
		TarefaController tarefaController = 
				new TarefaController();
		
		tarefaController.adicionaTarefa(4, 
						"Estudar", 
						"Preciso estudar Java", 
						Tarefa.Status.A);
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Cria um objeto PaisController para nos auxiliar na cria��o e exibi��o de
		 * dados referentes aos pa�ses
		 */
		//TarefaController tarefaController = new TarefaController();

		// Cria um objeto scanner para ler as entradas de teclado no console
		//Scanner scanner = new Scanner(System.in);

		// Variavel de controle para nossa estrutura de repeti��o
		//int opcao = -1;

		// Estrutura de repeti��o - Repete o la�o enquando o usu�rio n�o digitar a op��o
		// "0" - sair do sistema
		/*
		while (opcao != 0) {

			// Menu da nossa aplica��o
			System.out.println("==== Menu ====");
			System.out.println("1. Adiciona tarefa");
			System.out.println("2. Atualiza tarefa");
			System.out.println("3. Finaliza tarefa"); 
			System.out.println("4. Lista tarefa"); 
			System.out.println("5. Exclui tarefa");
			System.out.println("0. Sair");
			System.out.print("Escolha uma op��o: ");

			try {

				opcao = scanner.nextInt();

				switch (opcao) {

				case 1:

					break;

				case 2:
					break;

				case 3:
					break;

				case 4:
					break;

				case 5:
					break;

				case 0:
					System.out.println("Saindo...");
					break;

				default:
					System.out.println("Op��o inv�lida.");
					break;
				}
			}

			
			catch (java.util.InputMismatchException e) {
				System.out.println("Op��o inv�lida. Por favor, digite um n�mero inteiro v�lido.");
				scanner.nextLine();
			}
		}
		*/

	}

}
