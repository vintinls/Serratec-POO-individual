package br.com.trabIndividual.Application;

import java.io.IOException;

import br.com.trabIndividual.Service.MenuService;
import br.com.trabIndividual.io.RelatorioIO;

public class trabIndividualApplication {

	public static void main(String[] args) throws IOException, InterruptedException {

		RelatorioIO.leitor("banco");
		MenuService.menu();

	}

}
