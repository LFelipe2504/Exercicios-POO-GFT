package br.com.gft.main;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.models.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Pessoa joao = new Pessoa("João", 15);
		Pessoa leandro = new Pessoa("Leandro", 21);
		Pessoa paulo = new Pessoa("Paulo", 17);
		Pessoa jessica = new Pessoa("Jessica", 18);
		
		List<Pessoa> pessoas = new ArrayList<>();		
		pessoas.add(joao);
		pessoas.add(leandro);
		pessoas.add(paulo);
		pessoas.add(jessica);		
	
		System.out.println("Quantidade de pessoas na lista antes da exclusão dos menores de 18 anos: "+ pessoas.size()+".");
		
		pessoas.removeIf(pessoa -> pessoa.getIdade() < 18);			
		
		System.out.println("Quantidade de pessoas na lista após a exclusão dos menores de 18 anos: "+ pessoas.size()+".");
		
		
	}

}

