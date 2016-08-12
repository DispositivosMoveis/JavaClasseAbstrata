package br.edu.pacoteUm;

public abstract class Funcionario {

	private String nome;
	
	/**
	 * Classe que calculará o salário de um determinado Funcionario
	 * As classes filhas deverão desenvolver este método
	 * @return
	 */
	public abstract double calculasalario();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * O método calcula salário será chamado aqui
	 * e retornará o salário dependendo da classe filha criada.
	 * @return
	 */
	public double getSalario() {
		return calculasalario();
	}

	
}
