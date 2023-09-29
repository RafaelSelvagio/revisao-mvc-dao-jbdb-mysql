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
		 * Cria um objeto PaisController para nos auxiliar na criação e exibição de
		 * dados referentes aos países
		 */
		//TarefaController tarefaController = new TarefaController();

		// Cria um objeto scanner para ler as entradas de teclado no console
		//Scanner scanner = new Scanner(System.in);

		// Variavel de controle para nossa estrutura de repetição
		//int opcao = -1;

		// Estrutura de repetição - Repete o laço enquando o usuário não digitar a opção
		// "0" - sair do sistema
		/*
		while (opcao != 0) {

			// Menu da nossa aplicação
			System.out.println("==== Menu ====");
			System.out.println("1. Adiciona tarefa");
			System.out.println("2. Atualiza tarefa");
			System.out.println("3. Finaliza tarefa"); 
			System.out.println("4. Lista tarefa"); 
			System.out.println("5. Exclui tarefa");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");

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
					System.out.println("Opção inválida.");
					break;
				}
			}

			
			catch (java.util.InputMismatchException e) {
				System.out.println("Opção inválida. Por favor, digite um número inteiro válido.");
				scanner.nextLine();
			}
		}
		*/

	}

}
