package br.com.gft.main;

import br.com.gft.models.Guerreiro;
import br.com.gft.models.Mago;
import br.com.gft.models.Personagem;

public class Main {
	
	public static void main(String[] args) {
		
		Mago m1 = new Mago("Alakazam");
		Guerreiro g1 = new Guerreiro("Kratos");
		
		m1.lvlUp();
		m1.lvlUp();
		System.out.println("Mago "+m1);
		System.out.println("O valor do attack do mago "+m1.getNome()+ " é de "+ m1.attack()+".");
		
		System.out.println("---------------------------");
		g1.lvlUp();
		g1.lvlUp();
		System.out.println("Guerreiro " +g1);
		System.out.println("O valor do attack do guerreiro "+g1.getNome()+ " é de "+ g1.attack()+".");
		
		System.out.println("---------------------------");
		
		
		System.out.println("A quantidade de personagens criados é de: " + Personagem.getPersonagensCriados()+".");
		
		
		
		
		
		
		
	}
}
