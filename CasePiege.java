package jeuOie;

public class CasePiege extends Case {

    private Oie oieImmobilise = null;
    private String nomCase;

    public CasePiege(int numCase, String nomCase) {
        super(numCase);
        this.nomCase = nomCase;
    }

    public Case depart(Oie oie) {

        String couleurOie = oie.getCouleur();

        if (oieImmobilise == null) {
            return arrivee(oie);
        }
        if (oieImmobilise.getCouleur() == couleurOie) {
            oie.ajouterMessage("-L'oie " + couleurOie + " est toujours sur la case " + nomCase);
            return this;
        }
        if (oieImmobilise != null) {
            oieImmobilise = null;
            return super.depart(oie);
        }

        return this;
    }

    protected Case arrivee(Oie oie) {
        oie.ajouterMessage(" elle va sur la case " + nomCase + " et elle y reste");
        this.oieImmobilise = oie;
        return this;
    }
}
