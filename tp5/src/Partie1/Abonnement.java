package Partie1;

public abstract class Abonnement {
    private String nom;
    private double prixBase;
    private int nbProfils;

    public Abonnement(String nom, double prixBase, int nbProfils) {
        this.nom = nom;
        if (prixBase <= 0) this.prixBase = 50;
        else this.prixBase = prixBase;

        if (nbProfils <= 0) this.nbProfils = 1;
        else this.nbProfils = nbProfils;
    }

    public String getNom() { return nom; }
    public double getPrixBase() { return prixBase; }
    public int getNbProfils() { return nbProfils; }

    public boolean estPartageFamilial() {
        return nbProfils >= 3;
    }

    public void afficherInfos() {
        System.out.println("Nom: " + nom);
        System.out.println("Prix: " + prixBase);
        System.out.println("Profils: " + nbProfils);
    }

    public abstract double calculerCoutMensuel();
    public abstract int calculerScoreSatisfaction();
}