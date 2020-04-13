package br.com.alura.java.io.modelo;

import java.io.Serializable;

/**
 * Classe que representa um cliente do banco ByteBank
 * 
 * @author ARMS
 * @version 1.0
 *
 */
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cpf;
	private String profissao;
	private static int total;

	public Cliente(String nome, String cpf, String profissao) {
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
		Cliente.total++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public static int getTotal() {
		return Cliente.total;
	}
	
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + " CPF: " + this.cpf + " Profissão: " + this.profissao;
	}

}
