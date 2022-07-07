package jeuOie;

/*
 * La classe 'JeuOie' crée le plateau, le dé, et les oies
 * selon la couleur passée en paramètre de la méthode 'ajouterOie'.
 * Son constructeur prend un nombre maximum de joueurs.
 */

public class JeuOie { 
	
	  private Oie[] oies;  
	  private int nbOie = 0;  
	  private Plateau plateau = new Plateau();
	  private De des = new De();
	  
	  public JeuOie(int nbOieMax) {    
	    oies = new Oie[nbOieMax];
	  }

	  public void ajouterOie(String couleur) {  
	    if (nbOie < oies.length) {
	      oies[nbOie] = new Oie(couleur, plateau, des);
	      nbOie++;
	    }
	  }
	  
	  

	    public void jouer() {
	    	System.out.println("---------------------------------------------- |  Bienvenue dans le jeu de L'Oie |---------------------------------------\n "
	    			+ " ___________________________________ La partie va commencer préparez-vous ! Allons y _____________________________ \n \n");
	    	//Variable pour la lancement de partie et la fin
	        boolean finPartie = false;
	        //Variable précise le nombre de joueurs : 2 minimun
	        boolean b_oies = nbOie > 1;
	        //Boucle prinipale de la partie
	        int i;
	        while (!finPartie && b_oies) {
	            i = 0;
	            while (i < nbOie && !finPartie) {
	                finPartie = oies[i].action();
	                i ++;
	            }
	        }
	    }

	}
