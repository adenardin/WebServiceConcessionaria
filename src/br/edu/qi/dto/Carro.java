package br.edu.qi.dto;

public class Carro {

	private String nome;
	private String marca;
	private String modelo;
	private String placa;
	private float preco;
	private String montadora;
	private String status;

	public Carro(String nome, String marca, String modelo, String placa, float preco, String montadora, String status) {
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.preco = preco;
		this.montadora = montadora;
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
