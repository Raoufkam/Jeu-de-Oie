package jeuOie;
import java.util.Random;

/*
 * Elle possède une seule méthode retournant un entier entre 1 et 6.
 * Pour l'implanter, il faudra ajouter à la classe De un attribut rand initialisé
 * par une instance du générateur pseudo-aléatoire java.util.Random.
 */

public class De {
	
	//A completer
	private int randomNumber ;
	
	public int lancer() {
		int min = 1 ;
		int max = 6 ;
		Random rand = new Random() ;
		randomNumber = rand.nextInt(max + min) + min ;
		
		return randomNumber;
	}

}
