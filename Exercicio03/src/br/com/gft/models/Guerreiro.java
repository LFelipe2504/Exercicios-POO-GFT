package br.com.gft.models;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {	

	private List<String> habilidade;
	
	public Guerreiro(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	

	public List<String> getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(List<String> habilidade) {
		this.habilidade = habilidade;
	}
	
	@Override
	public void lvlUp() {
		setLevel(getLevel()+1) ;
		setForça(getForça()+3);
		setInteligencia(getInteligencia()+2);
		setMana(getMana()+2);
		setVida(getVida()+3);	
	}
	
	public int attack() {
		Random random = new Random();
		int numAleatorio = random.nextInt(301);
		int ValorDoAttack = (getForça() * getLevel()) + numAleatorio;
		return ValorDoAttack;	
		
	}
	
	public void aprenderHabilidade(String novaHabilidade) {
		
	}
	

}
