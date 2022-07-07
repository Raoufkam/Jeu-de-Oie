package jeuOie;

public class CaseRedirection extends Case {


    public CaseRedirection(int numCase) {
        super(numCase);
    }
    
    protected Case arrivee(Oie oie) {
        Case casePostRedirection = null;
        Plateau plateau = oie.getPlateau();
        switch (this.numCase) {
            //CASE : PONT
            case 6:
                casePostRedirection = plateau.donnerCase(12);
                oie.ajouterMessage(" tombe sur la case pont et va sur la case " + casePostRedirection.getNom());
                break;
            // CASE : LABYRINTHE
            case 42:
                casePostRedirection = plateau.donnerCase(30);
                oie.ajouterMessage(" tombe sur la case labyrinthe et va sur la case " + casePostRedirection.getNom());
                break;
            // CASE : MORT
            case 58:
                casePostRedirection = plateau.donnerCase(1);
                oie.ajouterMessage(" tombe sur la case mort et va sur la case " + casePostRedirection.getNom());
                break;
            default:
                System.out.println(" Redirection Echec ");
        }

        return casePostRedirection;
    }
}
