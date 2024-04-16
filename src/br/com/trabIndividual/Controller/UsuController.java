package br.com.trabIndividual.Controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.Util.Util;
import br.com.trabIndividual.Service.UsuService;

//cria classe UsuController
public class UsuController {

	// instancia do servico do Usuario, construção do objeto UsuService
	UsuService usuService = new UsuService();

	// cria o logger para ser usado logo abaixo
	static Logger logger = Util.setupLogger();

	public void listarNomesUsuarios() throws IOException {

		List<String> usuarios = usuService.listarUsuarios();
		Util.customizer();
		logger.log(Level.INFO, () -> usuarios + "\n\nLista gerada com sucesso!");
	}
	
	public void listarNomesUsuariosConsole() throws IOException {

		List<String> usuarios = usuService.listarUsuariosConsole();
		Util.customizer();
		logger.log(Level.INFO, () -> usuarios + "\n\nLista gerada com sucesso!");
	}

}
