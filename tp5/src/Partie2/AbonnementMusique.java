package Partie2;

import Partie1.Abonnement;
import Partie3.Reducible;

public class AbonnementMusique extends Abonnement implements Reducible {
    private int nbPlaylists;
    private boolean optionOffline;

    public AbonnementMusique(String nom, double prix, int nb, int pl, boolean off) {
        super(nom, prix, nb);
        nbPlaylists = pl;
        optionOffline = off;
    }

    public double calculerCoutMensuel() {
        double t = getPrixBase();
        if (optionOffline) t += 15;
        return t;
    }

    public int calculerScoreSatisfaction() {
        int s = 50;
        if (nbPlaylists > 20) s += 20;
        if (optionOffline) s += 20;
        if (getNbProfils() > 1) s += 10;
        if (s > 100) s = 100;
        return s;
    }

    public double appliquerReduction(double p) {
        if (p > 30) p = 30;
        return calculerCoutMensuel() * (1 - p / 100);
    }

    public boolean estEligibleReduction(double p) {
        return p <= 30;
    }
}