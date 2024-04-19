package br.com.trabIndividual.Controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.Util.Util;
import br.com.trabIndividual.Service.EndService;
import br.com.trabIndividual.entities.Endereco;

public class EndController {

	EndService endService = new EndService();
	static Logger logger = Util.setupLogger();

	public void listarEnderecos() throws IOException {
		endService.listarEnderecos();
		Util.customizer();
		logger.log(Level.INFO, () -> "\n\nLista gerada com sucesso!");
	}

	public void listarEnderecosConsole() throws IOException {
		List<Endereco> enderecos = endService.listarEnderecosConsole();
		for (Endereco endereco : enderecos) {
			Util.customizer();
			logger.log(Level.INFO, () -> endereco.getEstado() + ", " + endereco.getCidade() + ", "
					+ endereco.getBairro() + ", " + endereco.getRua() + ", " + endereco.getComplemento() + "\n");
		}
		Util.customizer();
		logger.log(Level.INFO, () -> "\n\nLista gerada com sucesso!");
	}
}
