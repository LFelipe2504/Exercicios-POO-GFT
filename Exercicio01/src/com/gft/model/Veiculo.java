package com.gft.model;

public class Veiculo {

	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;

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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean getIsLigado() {
		return isLigado;
	}

	public void setIsLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void acelerar() {
		if (this.isLigado == true)
			this.velocidade += 20;
		else 
			System.out.println("O carro precisa estar ligado para acelerar.");
	}

	public void abastecer(int combustivel) {

		if (combustivel + this.litrosCombustivel <= 60)
			this.litrosCombustivel += combustivel;
		else
			System.out.println(
					"A quantidade inserida de combustível ultrapaça o limite do tanque de 60 litros. Insira uma quantidade de combustível menor ou igual a "
							+ (60 - this.litrosCombustivel) + ".");
	}

	public void frear() {

		if (this.velocidade < 20)
			System.out.println("O veículo está parado.");
		else
			this.velocidade -= 20;
	}

	public void pintar(String cor) {
		this.cor = cor;
	}

	public void ligar() {
		if (this.isLigado == false)
			this.isLigado = true;
		else
			System.out.println("O carro já está ligado.");
	}

	public void desligar() {
		if (this.isLigado == true)

			if (this.velocidade == 0)
				this.isLigado = false;
			else
				System.out.println("O carro não pode ser desligado em movimento.");
		else
			System.out.println("O carro já está desligado.");
	}

}
