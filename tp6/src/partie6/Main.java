package partie6;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        
        ArrayList<Livre> livres = new ArrayList<Livre>();

        livres.add(new Livre("ISBN001", "Java pour débutants", "Dupont", 2020));
        livres.add(new Livre("ISBN002", "Algorithmique", "Martin", 2019));
        livres.add(new Livre("ISBN003", "Base de données", "Leroy", 2021));
        livres.add(new Livre("ISBN004", "Réseaux informatiques", "Simon", 2018));
        livres.add(new Livre("ISBN005", "Python avancé", "Blanc", 2022));

        
        HashSet<String> categories = new HashSet<String>();
        categories.add("Informatique");
        categories.add("Mathématiques");
        categories.add("Réseaux");
        categories.add("Informatique"); 
        System.out.println(" Catégories disponibles ");
        for (String cat : categories) {
            System.out.println("- " + cat);
        }

       
        HashMap<String, String> emprunts = new HashMap<String, String>();
        emprunts.put("Ali", "ISBN001");
        emprunts.put("Sara", "ISBN003");

        System.out.println("\n Livres empruntés ");
        for (String etudiant : emprunts.keySet()) {
            System.out.println(etudiant + " a emprunté le livre : " + emprunts.get(etudiant));
        }

        // 4. rechercher un livre par titre
        System.out.println("\n Recherche du livre 'Algorithmique' ");
        String titreCherche = "Algorithmique";
        boolean trouve = false;
        for (Livre l : livres) {
            if (l.titre.equals(titreCherche)) {
                System.out.println("Livre trouvé : " + l);
                trouve = true;
            }
        }
        if (!trouve) {
            System.out.println("Livre pas trouvé");
        }

     
        System.out.println("\n Suppression du livre ISBN002");
        Livre aSupprimer = null;
        for (Livre l : livres) {
            if (l.isbn.equals("ISBN002")) {
                aSupprimer = l;
            }
        }
        if (aSupprimer != null) {
            livres.remove(aSupprimer);
            System.out.println("Livre supprimé !");
        }
 
        System.out.println("\n Livres disponibles ");
        for (Livre l : livres) {
            if (!emprunts.containsValue(l.isbn)) {
                System.out.println(l);
            }
        }

    
        System.out.println("\n ....................RAPPORT FINA.................L");
        System.out.println("Nombre total de livres : " + livres.size());
        System.out.println("Nombre de catégories : " + categories.size());
        System.out.println("Nombre de livres empruntés : " + emprunts.size());
     
    }
}