package br.com.trabIndividual.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

	private static Logger logger = Util.setupLogger();

	private static Scanner sc = new Scanner(System.in);

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
			if (linha!= null) {
			String[] dados = linha.split(";");

			if (dados[0].equalsIgnoreCase(TipoRegistro.USUARIO.name())) {

				Usuario usuario = new Usuario(Integer.parseInt(dados[1]), dados[2], dados[3], dados[4], dados[5],
						dados[6], Integer.parseInt(dados[7]));
				//mapa
				Usuario.getMapaUsuarios().put(Integer.parseInt(dados[1]), usuario);
				
				logger.log(Level.INFO, usuario::toString);

			} else if (dados[0].equalsIgnoreCase(TipoRegistro.ENDERECO.name())) {
				Endereco endereco = new Endereco(Integer.parseInt(dados[1]), dados[2], dados[3], dados[4], dados[5],
						dados[6]);
				//mapa
				Endereco.getMapaEnderecos().put(Integer.parseInt(dados[1]), endereco);
				
				logger.log(Level.INFO, endereco::toString);

			} else {
				break;
			}
			}
		}
		buffRead.close();
	}

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
