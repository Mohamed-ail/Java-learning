package partie3;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> matieres = new HashSet<String>();

        matieres.add("Mathématiques");
        matieres.add("Informatique");
        matieres.add("Physique");
        matieres.add("Anglais");
        matieres.add("Informatique"); 
        matieres.add("Mathématiques"); 

      
        System.out.println("Matières dans HashSet ");
        System.out.println("Nombre de matières : " + matieres.size());
        
        System.out.println("Les matières :");
        for (String m : matieres) {
            System.out.println("- " + m);
        }

      
        TreeSet<String> matieresTrie = new TreeSet<String>();
        matieresTrie.addAll(matieres);

        System.out.println("\n Matières triées");
        for (String m : matieresTrie) {
            System.out.println("- " + m);
        }
    }
}