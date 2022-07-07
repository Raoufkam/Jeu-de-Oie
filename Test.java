package jeuOie;

public class Test {
	  public static void main(String argv[]){
	    JeuOie jeuOie = new JeuOie(2); 
	    jeuOie.ajouterOie("verte");
	    jeuOie.ajouterOie("jaune");
	    jeuOie.jouer();
	  }
}