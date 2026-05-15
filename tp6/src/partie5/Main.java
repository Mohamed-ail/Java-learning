package partie5;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        // 1. créer un TreeMap numéro -> nom
        TreeMap<Integer, String> etudiants = new TreeMap<Integer, String>();

        // 2. ajouter des étudiants
        etudiants.put(113, "Ali");
        etudiants.put(50, "Sara");
        etudiants.put(115, "Karim");
        etudiants.put(87, "Nadia");
        etudiants.put(120, "Omar");

        // 3. afficher la liste triée automatiquement (TreeMap trie par clé)
        System.out.println(" Liste triée automatiquement ");
        for (Map.Entry<Integer, String> entry : etudiants.entrySet()) {
            System.out.println("N" + entry.getKey() + " : " + entry.getValue());
        }

        // 4. premier et dernier
        System.out.println("\n Premier étudiant ");
        System.out.println("N" + etudiants.firstKey() + " : " + etudiants.get(etudiants.firstKey()));

        System.out.println("\nDernier étudiant ");
        System.out.println("N" + etudiants.lastKey() + " : " + etudiants.get(etudiants.lastKey()));

        // 5. étudiants avec numéro > 100
        System.out.println("\nÉtudiants avec numéro > 100 ");
        // tailMap retourne une vue à partir de la clé donnée
        Map<Integer, String> resultat = etudiants.tailMap(101);
        for (Map.Entry<Integer, String> entry : resultat.entrySet()) {
            System.out.println("N" + entry.getKey() + " : " + entry.getValue());
        }
    }
}