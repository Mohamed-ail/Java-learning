package partie1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

   public static void main(String[] args) {

       
        ArrayList<Etudiant> liste = new ArrayList<Etudiant>();

        liste.add(new Etudiant(1, "Ali", 14.5));
        liste.add(new Etudiant(2, "Mohamed", 17.0));
        liste.add(new Etudiant(3, "Karim", 11.0));
        liste.add(new Etudiant(4, "Ibrahim", 15.5));
        liste.add(new Etudiant(5, "Asaad", 20.0));

        System.out.println("Liste des étudiants ");
        for (Etudiant e : liste) {
            System.out.println(e);
        }

        
        System.out.println("\n Rechrche de Karim ");
        String nomRecherche = "Karim";
        boolean trouve = false;
        for (Etudiant e : liste) {
            if (e.nom.equals(nomRecherche)) {
                System.out.println("Trouve " + e);
                trouve = true;
            }
        }
        if (!trouve) {
            System.out.println("Étudiant pas trouvé");
        }

        
        System.out.println("\n Suppression de le étudiant ID=3 ");
        int idSupprimer = 3;
        Etudiant aSupprimer = null;
        for (Etudiant e : liste) {
            if (e.id == idSupprimer) {
                aSupprimer = e;
            }
        }
        if (aSupprimer != null) {
            liste.remove(aSupprimer);
            System.out.println("Étudiant supprimé !");
        }

        
        System.out.println("Liste après supprssion :");
        for (Etudiant e : liste) {
            System.out.println(e);
        }

       
        System.out.println("\nTri par moyenne croissante ");
        Collections.sort(liste, new Comparator<Etudiant>() {
            public int compare(Etudiant e1, Etudiant e2) {
                if (e1.moyenne < e2.moyenne) return -1;
                if (e1.moyenne > e2.moyenne) return 1;
                return 0;
            }
        });

        for (Etudiant e : liste) {
            System.out.println(e);
        }

       
        System.out.println("\n Meileur étudiant");
        Etudiant meilleur = liste.get(liste.size() - 1);
        System.out.println("Le meilleur est : " + meilleur);
    }
}