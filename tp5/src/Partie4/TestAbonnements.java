package Partie4;

import Partie1.Abonnement;
import Partie2.*;
import Partie3.Reducible;

public class TestAbonnements {
    public static void main(String[] args) {

        Abonnement[] tab = new Abonnement[3];

        tab[0] = new AbonnementVideo("vid", 100, 4, true, true);
        tab[1] = new AbonnementMusique("mus", 80, 2, 25, true);
        tab[2] = new AbonnementJeux("jeu", 120, 1, 60, 50);

        for (Abonnement a : tab) {
            a.afficherInfos();
            System.out.println(a.calculerCoutMensuel());
            System.out.println(a.calculerScoreSatisfaction());
        }

        Reducible[] r = new Reducible[2];
        r[0] = (Reducible) tab[0];
        r[1] = (Reducible) tab[1];

        for (Reducible x : r) {
            System.out.println(x.appliquerReduction(20));
            System.out.println(x.appliquerReduction(50));
        }
    }
}