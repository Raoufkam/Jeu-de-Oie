package jeuOie;

import java.io.*;

public class Test {
	  	public static void main(String argv[]) throws FileNotFoundException {
		
		FileOutputStream JeuOie = new FileOutputStream("Resultat_Partie.txt") ;
		System.setOut(new PrintStream(JeuOie));
	    JeuOie jeuOie = new JeuOie(2);
	    jeuOie.ajouterOie("verte");
	    jeuOie.ajouterOie("jaune");
	    jeuOie.jouer();
	  }

}
