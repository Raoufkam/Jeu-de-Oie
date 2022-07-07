package jeuOie;

public class CaseFaste extends Case {

    public CaseFaste(int numCase) {
        super(numCase);
    }


    public Case depart(Oie oie) {

        int valeurDes = oie.lancerDe();
        Case cArrivee = super.caseSuivante(oie, valeurDes + numCase);

        return cArrivee;
    }

    protected Case arrivee(Oie oie) {
        oie.ajouterMessage(" tombe sur une case faste et rejoue!\n");
        Case casePostFast = depart(oie);
        return casePostFast;
    }
}
