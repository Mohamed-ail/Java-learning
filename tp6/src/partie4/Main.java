package partie4;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // 1. créer un HashMap nom -> note
        HashMap<String, Double> notes = new HashMap<String, Double>();

        // 2. ajouter des étudiants avec leurs notes
        notes.put("Ali", 14.5);
        notes.put("Sara", 17.0);
        notes.put("Karim", 11.0);
        notes.put("Nadia", 15.5);
        notes.put("Omar", 13.0);

        // 3. afficher toutes les notes
        System.out.println("=== Notes de tous les étudiants ===");
        for (Map.Entry<String, Double> entry : notes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 4. rechercher la note d'un étudiant
        System.out.println("\n=== Note de Sara ===");
        if (notes.containsKey("Sara")) {
            System.out.println("Note de Sara : " + notes.get("Sara"));
        } else {
            System.out.println("Étudiant pas trouvé");
        }

        // 5. modifier la note d'un étudiant
        System.out.println("\n=== Modification de la note de Karim ===");
        notes.put("Karim", 13.5); // on remplace
        System.out.println("Nouvelle note de Karim : " + notes.get("Karim"));

        // 6. supprimer un étudiant
        System.out.println("\n=== Suppression de Omar ===");
        notes.remove("Omar");
        System.out.println("Omar supprimé !");

        // 7. calculer la moyenne générale
        System.out.println("\n=== Moyenne générale ===");
        double total = 0;
        for (double note : notes.values()) {
            total = total + note;
        }
        double moyenne = total / notes.size();
        System.out.println("Moyenne de la classe : " + moyenne);
    }
}