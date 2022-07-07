package jeuOie;

public class CaseJardin extends Case {


    public CaseJardin(int numCase) {
        super(numCase);
    }

    protected Case arrivee(Oie oie) {
        oie.ajouterMessage(" arrive au jardin et gagne!");
        return null;
    }
}