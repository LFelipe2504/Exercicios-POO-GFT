package br.com.gft.models;

import java.util.List;
import java.util.Random;

public class Mago extends Personagem {	

	private List<String> magia;

	public Mago(String nome) {
		super(nome);
	}
	
	public List<String> getMagia() {
		return magia;
	}

	public void setMagia(List<String> magia) {
		this.magia = magia;
	}	
	
	@Override
	public void lvlUp() {
		setLevel(getLevel()+1) ;
		setForça(getForça()+2);
		setInteligencia(getInteligencia()+3);
		setMana(getMana()+3);
		setVida(getVida()+2);	
	}

	public int attack() {
		Random random = new Random();
		int numAleatorio = random.nextInt(301);		
		int ValorDoAttack = (getInteligencia() * getLevel()) + numAleatorio;
		return ValorDoAttack;	
		
	}
	
	public void aprenderMagia(String novaMagia) {
		
	}

}
