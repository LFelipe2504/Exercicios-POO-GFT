package br.com.gft.models;

import java.util.Objects;

public abstract class Personagem {
	
	private String nome;
	private int vida;
	private int mana;
	private float xp;
	private int inteligencia;
	private int força;
	private int level;
	private static int personagensCriados = 0; 	
		
	
	public Personagem(String nome) {
		personagensCriados ++;
		this.nome = nome;
	}
	
	public static int getPersonagensCriados() {
		return personagensCriados;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public float getXp() {
		return xp;
	}

	public void setXp(float xp) {
		this.xp = xp;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getForça() {
		return força;
	}

	public void setForça(int força) {
		this.força = força;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public void lvlUp() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(força, inteligencia, level, mana, nome, vida, xp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personagem other = (Personagem) obj;
		return força == other.força && inteligencia == other.inteligencia && level == other.level && mana == other.mana
				&& Objects.equals(nome, other.nome) && vida == other.vida
				&& Float.floatToIntBits(xp) == Float.floatToIntBits(other.xp);
	}

	@Override
	public String toString() {
		return "Personagem [nome=" + nome + ", vida=" + vida + ", mana=" + mana + ", xp=" + xp + ", inteligencia="
				+ inteligencia + ", força=" + força + ", level=" + level + "]";
	}
	
	

}
