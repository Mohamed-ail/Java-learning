package partie3;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        // 1. ajouter des matières dans un HashSet
        HashSet<String> matieres = new HashSet<String>();

        matieres.add("Mathématiques");
        matieres.add("Informatique");
        matieres.add("Physique");
        matieres.add("Anglais");
        matieres.add("Informatique"); // doublon exprès pour tester
        matieres.add("Mathématiques"); // doublon aussi

        // 2. vérifier pas de doublons
        System.out.println("=== Matières dans HashSet ===");
        System.out.println("Nombre de matières : " + matieres.size());
        // normalement on doit avoir 4 et pas 6

        // 3. afficher les matières
        System.out.println("Les matières :");
        for (String m : matieres) {
            System.out.println("- " + m);
        }

        // 4. copier dans un TreeSet
        TreeSet<String> matieresTrie = new TreeSet<String>();
        matieresTrie.addAll(matieres);

        // 5. afficher triées par ordre alphabétique
        System.out.println("\n=== Matières triées (TreeSet) ===");
        for (String m : matieresTrie) {
            System.out.println("- " + m);
        }
    }
}