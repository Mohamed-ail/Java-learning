package partie5;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

   
        TreeMap<Integer, String> etudiants = new TreeMap<Integer, String>();

    
        etudiants.put(113, "Ali");
        etudiants.put(50, "Sara");
        etudiants.put(115, "Karim");
        etudiants.put(87, "Nadia");
        etudiants.put(120, "Omar");

      
        System.out.println(" Liste triée automatiquement ");
        for (Map.Entry<Integer, String> entry : etudiants.entrySet()) {
            System.out.println("N" + entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\n Premier étudiant ");
        System.out.println("N" + etudiants.firstKey() + " : " + etudiants.get(etudiants.firstKey()));

        System.out.println("\nDernier étudiant ");
        System.out.println("N" + etudiants.lastKey() + " : " + etudiants.get(etudiants.lastKey()));

        
        System.out.println("\nÉtudiants avec numéro > 100 ");
        
        Map<Integer, String> resultat = etudiants.tailMap(101);
        for (Map.Entry<Integer, String> entry : resultat.entrySet()) {
            System.out.println("N" + entry.getKey() + " : " + entry.getValue());
        }
    }
}