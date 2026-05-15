package partie4;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

       
        HashMap<String, Double> notes = new HashMap<String, Double>();

      
        notes.put("Ali", 14.5);
        notes.put("Sara", 17.0);
        notes.put("Karim", 11.0);
        notes.put("Nadia", 15.5);
        notes.put("Omar", 13.0);

      
        System.out.println(" Notes de tous les étudiants");
        for (Map.Entry<String, Double> entry : notes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

       
        System.out.println("\nNote de Sara");
        if (notes.containsKey("Sara")) {
            System.out.println("Note de Sara : " + notes.get("Sara"));
        } else {
            System.out.println("Étudiant pas trouvé");
        }

        
        System.out.println("\nModification de la note de Karim ");
        notes.put("Karim", 13.5); 
        System.out.println("Nouvelle note de Karim : " + notes.get("Karim"));

        
        System.out.println("\n Suppression de Omar");
        notes.remove("Omar");
        System.out.println("Omar supprimé !");

    
        System.out.println("\n Moyenne générale ");
        double total = 0;
        for (double note : notes.values()) {
            total = total + note;
        }
        double moyenne = total / notes.size();
        System.out.println("Moyenne de la classe : " + moyenne);
    }
}