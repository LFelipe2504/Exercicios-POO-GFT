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
			
		System.out.println("A lista contém o objeto 'Jessica' ?\n"+ pessoas.contains(jessica));
		System.out.println("A idade de Jessica é de:");
		if (pessoas.contains(jessica))
			System.out.println(jessica.getIdade());
			
	}

}

