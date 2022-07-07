package jeuOie;


/*
 * Elle poss�de un attribut couleur et des liens vers le d�,
 * le plateau, la case o� elle est ainsi que son journal dans
 * lequel elle note tout ce qu�elle fait.
 * Son constructeur permet de lui attribuer sa couleur,
 * la r�f�rence du plateau sur lequel elle �volue,
 * la case o� elle se trouve (la premi�re case du plateau : 
 * case n�1, accessible via le plateau qui a stock� sa r�f�rence
 * dans son tableau cases � l�indice 0).
 */

public class Oie extends Plateau {
	
	private String couleur ;
	private De des ;
	private Journal journal = new Journal() ;
	private Case placement ;
	private Plateau plateau ;
	
	
	public Oie(String couleur , Plateau plateau,De des){
		super();
		this.couleur = couleur ;
		this.des = des ;
		this.placement = plateau.caseDebutPartie() ;
		this.plateau = plateau ;
	}
	
	public Plateau getPlateau() {
		return plateau ;
	}

	public String getCouleur() {
		return couleur;
	}
	
	/*
	 * action: qui permet de lui donner la main en d�but de tour;
	 */
	
	public boolean action() {
		//A Completer
		Case casePlateau = this.placement.depart(this);
		placement = casePlateau ;
		journal.afficherMessage();
		
		return (casePlateau == null) ;
	}
	
	/*
	 * lancerDe: pour qu�elle lance les d�s ;
	 */
	
	public int lancerDe() {
		//A Completer
		int resDes = des.lancer();
		ajouterMessage(" -> elle fait " + resDes + " deplacement devant et");
		return resDes;
	}
	
	/*
	 * ajouterMessage pour qu�elle ajoute un message
	 * pass� en param�tre dans son journal.
	 */
	
	public void ajouterMessage(String message) {
		//Ajoute un message
		journal.ajouterMessage(message);
		
	}	

}
