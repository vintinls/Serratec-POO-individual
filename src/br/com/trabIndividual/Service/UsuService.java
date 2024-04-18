package br.com.trabIndividual.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.trabIndividual.entities.Usuario;
import br.com.trabIndividual.io.RelatorioIO;

public class UsuService {
	
	public void  listarUsuarios() throws IOException {
		List<String> listaUsuarios = new ArrayList<>();
		for (Usuario usuario : Usuario.getMapaUsuarios().values()) {
			listaUsuarios.add(usuario.getNomeCompleto());
		}
		
		RelatorioIO.relatorioListaUsuarios(listaUsuarios);
		return;
	}

	public List<String> listarUsuariosConsole() throws IOException {
		List<String> listaUsuariosConsole = new ArrayList<>();
		for (Usuario usuario : Usuario.getMapaUsuarios().values()) {
			listaUsuariosConsole.add(usuario.getNomeCompleto());
		}
		return listaUsuariosConsole;

	}
}