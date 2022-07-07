package jeuOie;

public class CaseHotel extends Case {

    private int nbToursRestant;

    public CaseHotel(int numCase) {
        super(numCase);
    }

    public CaseHotel(int numCase, int nbToursRestant) {
        super(numCase);
        this.nbToursRestant = nbToursRestant;
    }

    public Case depart(Oie oie) {
        Case caseArrivee = null;

        if (this.nbToursRestant == 0) {
            caseArrivee = super.depart(oie);

        } else if (this.nbToursRestant > 0){
            this.nbToursRestant --;
            String couleurOie = oie.getCouleur();
            oie.ajouterMessage("-L'oie " + couleurOie+"est a l'hotel pour encore " + this.nbToursRestant +"tours");
            caseArrivee = this;
        } else {
            //A l'hotel
            caseArrivee = arrivee(oie);
        }
        return caseArrivee;
    }


    protected Case arrivee(Oie oie) {
        oie.ajouterMessage(" elle va sur la case hotel");
        Case caseHotel = new CaseHotel(this.numCase, 2);
        return caseHotel;
    }
}
