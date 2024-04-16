package br.com.trabIndividual.Service;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.Util.Util;
import br.com.trabIndividual.Controller.EndController;
import br.com.trabIndividual.Controller.UsuController;

public class SubMenuService {

	static Logger logger = Util.setupLogger();
	static Scanner sc = new Scanner(System.in);

	public static void subMenuImpresso() throws IOException, InterruptedException {

		UsuController usuController = new UsuController();
		EndController endController = new EndController();

		Util.customizer();
		logger.log(Level.INFO, """
				Menu interativo:
				[1]\tListar Nomes dos Usuarios
				[2]\tListar Endereços
				[0]\tSair
				Digite uma opção:
				""");

		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			Util.customizer();
			logger.log(Level.INFO, "Lista os nomes dos Usuarios");
			usuController.listarNomesUsuarios();
			logger.log(Level.INFO, "\n\n");
			subMenuImpresso();
			break;
		case 2:
			Util.customizer();
			logger.log(Level.INFO, "Lista de Endereços");
			endController.listarEnderecos();
			logger.log(Level.INFO, "\n\n");
			subMenuImpresso();
			break;
		case 0:
			MenuService.menu();
			break;
		default:
			Util.customizer();
			logger.log(Level.INFO, "Opção inválida!");
			subMenuImpresso();
			break;
		}

	}

	public static void subMenuConsole() throws IOException, InterruptedException {
		UsuController usuController = new UsuController();
		EndController endController = new EndController();
		
		
		Util.customizer();
		logger.log(Level.INFO, """
				Menu interativo:
				[1]\tLista com nomes dos usuarios
				[2]\tLista com enderecos
				[0]\tSair
				Digite uma opção:
				""");

		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			Util.customizer();
			logger.log(Level.INFO, "Lista os nomes usuarios");
			usuController.listarNomesUsuariosConsole();
			logger.log(Level.INFO, "\n\n");
			subMenuConsole();
			break;

		case 2:
			Util.customizer();
			logger.log(Level.INFO, "Lista de Endereços");
			endController.listarEnderecosConsole();
			logger.log(Level.INFO, "\n\n");
			subMenuImpresso();

		case 0:
			MenuService.menu();
			break;
		default:
			Util.customizer();
			logger.log(Level.INFO, "Opção inválida!");
			subMenuConsole();
			break;
		}

	}
}
