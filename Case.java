package jeuOie;

/*
 * Elle poss�de un attribut : son num�ro de case initialis� par
 * le constructeur et deux m�thodes publiques :
 * 
 *- getNom : retourne le num�ro de la case sous la forme 
 *  d�une cha�ne : " numero " + numCase,

	- depart : action � effectuer au d�but du tour qui 
	  appelle la m�thode priv�e (ou protected ?) caseSuivante 
	  pour conna�tre o� elle doit aller puis la m�thode 
	  priv�e (ou protected ?) arrivee qui donne les actions � 
	  effectuer lorsque l�oie tombe sur la case.
	  
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
