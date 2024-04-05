package br.com.trabIndividual.entities;

public class Usuario {

	// definição de entidades
	private int id;
	private String nomeCompleto;
	private String cpf;
	private String telefone;
	private String email;
	private String genero;
	private int fkEnd;

	// construtor default
	public Usuario() {
		super();// herança
	}

	// construtor utilizando atributos
	public Usuario(int id, String nomeCompleto, String cpf, String telefone, String email, String genero, int fkEnd) {
		super();

		this.id = id;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.genero = genero;
		this.fkEnd = fkEnd;
	}

	//gets e sets
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getFkEnd() {
		return fkEnd;
	}

	public void setFkEnd(int fkEnd) {
		this.fkEnd = fkEnd;
	}

	

}
