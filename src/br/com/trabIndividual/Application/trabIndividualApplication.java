package br.com.trabIndividual.Application;

import java.io.IOException;

import br.com.trabIndividual.Service.SubMenuService;
import br.com.trabIndividual.io.RelatorioIO;

public class trabIndividualApplication {

	public static void main(String[] args) throws IOException, InterruptedException {

		RelatorioIO.leitor("banco");
		SubMenuService.subMenuConsole();

	}

}
