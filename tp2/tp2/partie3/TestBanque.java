package partie3;
import partie1.CompteBancaire;
import partie2.Banque;

public class TestBanque {

 public static void main(String[] args) {

     // Question1
     Banque b = new Banque("MarocBank", 1500);

     // Question2
     CompteBancaire c1 = new CompteBancaire("Mohamed Ali", 1000, 500);
     CompteBancaire c2 = new CompteBancaire("Othman", 2000, 300);
     CompteBancaire c3 = new CompteBancaire("Ismail", 1500, 400);

     // Question3
     b.ajouterCompte(c1);
     b.ajouterCompte(c2);
     b.ajouterCompte(c3);

     // Question4
     c1.deposer(500);
     c1.retirer(300);
     c2.virementVers(c3, 400);

     // Question5
     b.afficherTous();

     // Question6
     double s1 = c2.calculerSoldeAvecInterets();
     double s2 = c2.calculerSoldeAvecInterets(0.015);

     System.out.println("Solde avec interets : " + s1);
     System.out.println("Solde avec bonus : " + s2);

     // Question7
     System.out.println("Nombre total comptes : " + CompteBancaire.getNbComptes());
     System.out.println("Taux interet : " + CompteBancaire.getTauxInteretAnnuel());
 }
}