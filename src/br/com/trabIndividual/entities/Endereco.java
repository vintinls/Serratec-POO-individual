package br.com.trabIndividual.entities;

import java.util.HashMap;
import java.util.Map;

public class Endereco {

	// definição de entidades
	private Integer id;
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private String complemento;

	static Map<Integer, Endereco> mapaEnderecos = new HashMap<>();

	// cronstrutor default
	public Endereco() {
		super();// herança
	}

	// construtor utilizando os atributos
	public Endereco(Integer id, String estado, String cidade, String bairro, String rua, String complemento) {
		super();

		this.id = id;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.complemento = complemento;
	}

	// gets e sets
	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public static Map<Integer, Endereco> getMapaEnderecos() {
		return mapaEnderecos;
	}

	public static void setMapaEnderecos(Map<Integer, Endereco> mapaEnderecos) {
		Endereco.mapaEnderecos = mapaEnderecos;
	}

	@Override
	public String toString() {
		return "Endereco--> id: " + id + ", estado: " + estado + ", cidade: " + cidade + ", bairro: " + bairro
				+ ", rua: " + rua + ", complemento: " + complemento + "]";
	}

}
