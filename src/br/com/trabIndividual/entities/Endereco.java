package br.com.trabIndividual.entities;

public class Endereco {

	// definição de entidades
	private int id;
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private String complemento;

	// cronstrutor default
	public Endereco() {
		super();// herança
	}

	// construtor utilizando os atributos
	public Endereco(int id, String estado, String cidade, String bairro, String rua, String complemento) {
		super();
		
		this.id = id;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.complemento = complemento;
	}

	//gets e sets
	public int getId() {
		return id;
	}

	public void setId(int id) {
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

}
