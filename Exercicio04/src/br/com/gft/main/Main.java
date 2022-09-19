package br.com.gft.main;

import java.util.ArrayList;
import java.util.Collections;
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
		
		List<Integer> idades = new ArrayList<>();
		
		for (Pessoa pessoa : pessoas) {
			idades.add(pessoa.getIdade());
		}
		
		for (Pessoa pessoa : pessoas) {
			int maiorIdade = Collections.max(idades);
			if(pessoa.getIdade() == maiorIdade)
				System.out.println( "Pessoa mais velha: "+ pessoa.getNome()+".");
			
		}
		
	}

}
