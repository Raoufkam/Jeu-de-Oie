package jeuOie;

/*
 * Elle possède un attribut : son numéro de case initialisé par
 * le constructeur et deux méthodes publiques :
 * 
 *- getNom : retourne le numéro de la case sous la forme 
 *  d’une chaîne : " numero " + numCase,

	- depart : action à effectuer au début du tour qui 
	  appelle la méthode privée (ou protected ?) caseSuivante 
	  pour connaître où elle doit aller puis la méthode 
	  privée (ou protected ?) arrivee qui donne les actions à 
	  effectuer lorsque l’oie tombe sur la case.
	  
 */
public class Case {
	
	protected int numCase ;

	public Case(int numCase) {
		super();
		this.numCase = numCase;
	}
	
	
	public String getNom() {
		
		String chaineCase = ("numero "+this.numCase) ;	
		return chaineCase ;
	}
	
	public Case depart(Oie oie) {
		//A completer
		String couleurOie = oie.getCouleur();
		String nomCase = getNom();
		oie.ajouterMessage(" - Le oie de couleur " + couleurOie
				 + " est placer sur la case " + nomCase);
		int resDes = oie.lancerDe();
		Case CaseArriver = caseSuivante(oie, resDes + numCase);
		
		return CaseArriver  ;
	}
	
	protected Case arrivee(Oie oie) {
		//A completer
		String nomCase = getNom();
		oie.ajouterMessage(" elle va sur la case " + nomCase);	
		return this ;
	}
	
    protected Case caseSuivante(Oie oie, int numCaseDestination) {
    	
        Plateau plateau = oie.getPlateau();
        
        if (numCaseDestination > 63) {
            numCaseDestination = 63 - (numCaseDestination % 63);
        }
        
        Case caseDestination = plateau.donnerCase(numCaseDestination);
        Case caseArrivee = caseDestination.arrivee(oie);

        return caseArrivee;
    }
	
	

}
