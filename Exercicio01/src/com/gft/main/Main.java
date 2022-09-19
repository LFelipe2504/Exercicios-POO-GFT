package com.gft.main;

import com.gft.model.Veiculo;

public class Main {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
		
		//Abastece e verifica a validação da capacidade de 60 litros no tanque. 
		veiculo.abastecer(31);
		System.out.println("A quantidade de litros de combustível no veículo é de: "+veiculo.getLitrosCombustivel());
		
		veiculo.abastecer(50);

		System.out.println("------------------------------\n");
		// Verifica se os métodos ligar e desligar funcionam.
		System.out.println("O veiculo está ligado?\n"+ veiculo.getIsLigado());
		
		veiculo.ligar();
		veiculo.ligar();

		veiculo.acelerar();
		veiculo.desligar();
		veiculo.frear();
		veiculo.desligar();		
		System.out.println("\nO veiculo está ligado?\n"+ veiculo.getIsLigado());
		
		System.out.println("------------------------------\n");	
		// Verifica se os métodos acelerar e frear funcionam. 
		veiculo.ligar();
		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.acelerar();
		System.out.println("A velocidade do veículo é de: "+veiculo.getVelocidade()+"\n");
		
		veiculo.frear();
		veiculo.frear();
		veiculo.frear();
		System.out.println("A velocidade do veículo é de: "+veiculo.getVelocidade());
		// Verifica se os método pintar funciona. 
		veiculo.frear();
		
		System.out.println("------------------------------\n");
		
		veiculo.pintar("Preto");		
		System.out.println("A cor do veículo é: "+ veiculo.getCor());
		
		
		


		

	}

}
