package jeuOie;
import java.util.Random;

/*
 * Elle poss�de une seule m�thode retournant un entier entre 1 et 6.
 * Pour l'implanter, il faudra ajouter � la classe De un attribut rand initialis�
 * par une instance du g�n�rateur pseudo-al�atoire java.util.Random.
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
