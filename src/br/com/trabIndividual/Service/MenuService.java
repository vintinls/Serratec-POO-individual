package br.com.trabIndividual.Service;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.Util.Util;
import br.com.trabIndividual.Controller.EndController;
import br.com.trabIndividual.Controller.UsuController;

//cria uma classe publica chamada MenuService
public class MenuService {

	// inicia um logger para imprimir algo na tela
	static Logger logger = Util.setupLogger();

	// inicia um scanner para ler oque o usuario escreve no console
	static Scanner sc = new Scanner(System.in);

	// cria um menu publico estatico e void(nao retorna nada)
	public static void menu() throws IOException {

		// instancia do controller dentro desse menu
		UsuController usuController = new UsuController();

		// instancia do controller dentro desse menu
		EndController endController = new EndController();

		// para nao duplicar
		Util.customizer();
		// cria o logger para informar o menu interativo
		logger.log(Level.INFO, () -> "Menu Interativo: " + "\n\n" + "[1]\tListar nomes usuarios" + "\n"
				+ "[2]\tListar Endereços: " + "\n" + "[0]\tSair" + "\n\nEscolha uma opção: ");

		// define uma variavel opcao que vai ser definida por um scanner inteiro
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:

			// para nao duplicar o logger
			Util.customizer();
			// titulo para informar oque o usuario vai ver
			logger.log(Level.INFO, "Lista os nomes dos usuarios");

			// chama a lista de nomes dos usuarios
			usuController.listarNomesUsuarios();

			// pula alinha para nao ficar tudo junto
			logger.log(Level.INFO, "\n\n");

			// nao tem outra opção dentro de [1], podemos retornar o menu
			menu();

			// uma parada
			break;


		case 0:

			// para nao duplicar
			Util.customizer();
			// logger para informar que o programa foi fechado e uma mensagem qualquer
			logger.log(Level.INFO, "Programa Interrompido.\nVolte sempre!");

			// uma parada
			break;

		default:

			// para nao dulicar o logger
			Util.customizer();
			logger.log(Level.INFO, "Opção invalida!");

			// ele retona o usuario para a funçao menu de novo, para uma nova tenativa
			menu();

			// uma parada
			break;
		}
	}

}
