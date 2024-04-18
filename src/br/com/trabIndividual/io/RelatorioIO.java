package br.com.trabIndividual.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.Util.Util;
import br.com.trabIndividual.entities.Endereco;
import br.com.trabIndividual.entities.Usuario;
import br.com.trabIndividual.enums.TipoRegistro;

public class RelatorioIO {

	static final String PATH_BASICO = "./temp/";

	static final String EXTENSAO = ".txt";

	private static Scanner sc = new Scanner(System.in);

	private static Logger logger = Util.setupLogger();

	public static String lerLinha() {
		return sc.nextLine();
	}

	public static void fecharScanner() {
		sc.close();
	}

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));
		String linha = "";
		while (true) {

			linha = buffRead.readLine();
			if (linha != null) {
				String[] dados = linha.split(";");

				if (dados[0].equalsIgnoreCase(TipoRegistro.USUARIO.name())) {

					Usuario usuario = new Usuario(Integer.parseInt(dados[1]), dados[2], dados[3], dados[4], dados[5],
							dados[6], Integer.parseInt(dados[7]));
					// mapa
					Usuario.getMapaUsuarios().put(Integer.parseInt(dados[1]), usuario);

					// logger.log(Level.INFO, usuario::toString);

				} else if (dados[0].equalsIgnoreCase(TipoRegistro.ENDERECO.name())) {
					Endereco endereco = new Endereco(Integer.parseInt(dados[1]), dados[2], dados[3], dados[4], dados[5],
							dados[6]);
					// mapa
					Endereco.getMapaEnderecos().put(Integer.parseInt(dados[1]), endereco);

					// logger.log(Level.INFO, endereco::toString);
				}
			} else {
				break;
			}
		}
		buffRead.close();
	}

	public static void relatorioListaUsuarios(List<String> nomesUsuarios) throws IOException {
		String nome = "lista-nomes-usuarios";
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + EXTENSAO, true));
		buffWrite.append("-------RELATÓRIO: LISTA NOMES DE PETS------\n\n");

		if (!nomesUsuarios.isEmpty()) {

			buffWrite.append("Nome dos Usuarios: \n\n");

			for (String nomeUsuario : nomesUsuarios) {
				buffWrite.append("\n" + nomeUsuario + "\n");
			}

			buffWrite.append("\n---------FIM DA LISTA NOMES USUARIOS --------/n");
			buffWrite.close();
		}
	}

	public static void relatorioListaUsuariosConsole(List<String> nomesUsuarios) throws IOException {

		logger.log(Level.INFO, () -> "-------RELATÓRIO: LISTA NOMES DE PETS------");

		if (!nomesUsuarios.isEmpty()) {

			logger.log(Level.INFO, () -> "Nome dos usuarios: ");

			for (String nomeUsuario : nomesUsuarios) {

				logger.log(Level.INFO, () -> nomeUsuario + "\n");

			}

			logger.log(Level.INFO, () -> "---------FIM DA LISTA NOMES USUARIOS --------/n");

		}
	}

	public static void relatorioListaEndereco(List<Endereco> endereco) throws IOException {
		String nome = "lista-enderecos";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + EXTENSAO, true));

		buffWrite.append("-------RELATÓRIO: LISTA DE ENDERECOS------\n\n");
		if (!endereco.isEmpty()) {

			for (Endereco endereco1 : endereco) {
				buffWrite.append("\n\nId: " + endereco1.getId() + "\nEstado: " + endereco1.getEstado() + "\nCidade: "
						+ endereco1.getCidade() + "\nBairro: " + endereco1.getBairro() + "Rua: " + endereco1.getRua()
						+ "Complemento: " + endereco1.getComplemento());
			}
		}
		buffWrite.append("\n\n---------FIM DA LISTA DE ENDERECOS--------\n\n");
		buffWrite.close();
	}

	public static void relatorioListaEnderecoConsole(List<Endereco> endereco) throws IOException {

		logger.log(Level.INFO, () -> "-------RELATÓRIO: LISTA DE ENDERECOS------\n\n");
		if (!endereco.isEmpty()) {

			for (Endereco endereco1 : endereco) {
				logger.log(Level.INFO, () -> "Estado: " + endereco1.getEstado() + "\nCidade: " + endereco1.getCidade());
			}
		}
		logger.log(Level.INFO, () -> "\n\n---------FIM DA LISTA DE ENDERECOS--------\n\n");
	}

	// escritor

	public static void escritor(String path) throws IOException {

		Util.customizer();
		logger.log(Level.INFO, () -> "Escreva o nome do arquivo: ");
		String nome = lerLinha();

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + EXTENSAO, true));
		String linha = "";

		Util.customizer();
		logger.log(Level.INFO, () -> "Escreva algo: ");
		linha = lerLinha();
		buffWrite.append(linha + "\n");
		buffWrite.close();
		fecharScanner();

	}
}
