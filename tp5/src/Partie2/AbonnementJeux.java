package Partie2;

import Partie1.Abonnement;

public class AbonnementJeux extends Abonnement {
    private int nbJeuxInclus;
    private int heuresJeuParMois;

    public AbonnementJeux(String nom, double prix, int nb, int jeux, int heures) {
        super(nom, prix, nb);
        nbJeuxInclus = jeux;
        heuresJeuParMois = heures;
    }

    public double calculerCoutMensuel() {
        double t = getPrixBase();
        if (nbJeuxInclus > 50) t += 25;
        if (heuresJeuParMois > 40) t += 15;
        return t;
    }

    public int calculerScoreSatisfaction() {
        int s = 40;
        if (nbJeuxInclus >= 30) s += 20;
        if (heuresJeuParMois >= 20) s += 20;
        if (getNbProfils() >= 2) s += 10;
        if (s > 100) s = 100;
        return s;
    }
}