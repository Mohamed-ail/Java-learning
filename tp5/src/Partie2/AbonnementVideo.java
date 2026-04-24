package Partie2;

import Partie1.Abonnement;
import Partie3.Reducible;

public class AbonnementVideo extends Abonnement implements Reducible {
    private boolean optionHD;
    private boolean option4K;

    public AbonnementVideo(String nom, double prix, int nb, boolean hd, boolean k4) {
        super(nom, prix, nb);
        optionHD = hd;
        option4K = k4;
    }

    public double calculerCoutMensuel() {
        double t = getPrixBase();
        if (optionHD) t += 10;
        if (option4K) t += 20;
        return t;
    }

    public int calculerScoreSatisfaction() {
        int s = 60;
        if (optionHD) s += 10;
        if (option4K) s += 20;
        if (getNbProfils() >= 4) s += 10;
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