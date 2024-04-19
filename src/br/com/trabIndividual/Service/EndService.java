package br.com.trabIndividual.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.trabIndividual.entities.Endereco;
import br.com.trabIndividual.io.RelatorioIO;

public class EndService {

	public void listarEnderecos() throws IOException {
		List<Endereco> listaEnderecos = new ArrayList<>();
		for (Endereco endereco : Endereco.getMapaEnderecos().values()) {
			listaEnderecos.add(endereco);
		}
		RelatorioIO.relatorioListaEndereco(listaEnderecos);
		return;
	}

	public List<Endereco> listarEnderecosConsole() throws IOException {
		List<Endereco> listaEnderecos = new ArrayList<>();
		for (Endereco endereco : Endereco.getMapaEnderecos().values()) {
			listaEnderecos.add(endereco);
		}
		return listaEnderecos;
	}
}
