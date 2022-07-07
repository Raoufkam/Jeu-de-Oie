package jeuOie;

/*
 * Elle possède deux attributs : une constante NB_CASES
 * correspondant au nombre de cases d’un plateau de jeu de l’oie (63 cases)
 * et un tableau cases contenant les cases du plateau.
 */

public class Plateau {
	
	final int NB_CASES = 63;
	private Case[] cases = new Case[NB_CASES];
	
	/*
	 * Le constructeur initialise l’ensemble des cases du plateau 
	 * (boucle for).
	 * Elle possède une méthode donnant la première case du plateau
	 * et une autre donnant la case correspondant à un numéro.
	 */
	
	public Plateau() {
		//A completer
		for(int i=0 ; i<NB_CASES;i++)
		{
			cases[i] = new Case(i+1);
		}
		
		initialisationCasesSpecifique();
	} 
	
	
	public Case caseDebutPartie() {
		
		return cases[0];
	}
	
	public Case donnerCase(int numCase) {
		return cases[numCase-1] ;
	}
	
	
	protected int getNB_CASES() {
		return NB_CASES;
	}
	
	
	private void initialisationCasesSpecifique() {

	        //cases redirection
	        cases[5] = new CaseRedirection(6);
	        cases[41] = new CaseRedirection(42);
	        cases[57] = new CaseRedirection(58);

	        //case jardin
	        cases[NB_CASES - 1] = new CaseJardin(NB_CASES);

	        //cases fastes
	        for (int i = 9; i < 63; i += 9) {
	            cases[i - 1] = new CaseFaste(i);
	        }

	        //case hotel
	        cases[18] = new CaseHotel(19);

	        //case piege
	        cases[30] = new CasePiege(31, "puits");
	        cases[51] = new CasePiege(52, "prison");
	 }
}
