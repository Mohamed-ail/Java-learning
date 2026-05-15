package partie2;

public class Main {

    
    public static double lireMontant(String valeur) {

        double montant = 0;

        try {
            montant = Double.parseDouble(valeur);
        } catch (NumberFormatException e) {
            
            System.out.println("Erreur : la valeur '" + valeur + "' n'est pas un nombre valide");
            return 0; 
        }

        
        if (montant < 0) {
            throw new IllegalArgumentException("Le montant ne peut pas  négatif !");
        }

        return montant;
    }

    public static void main(String[] args) {

        System.out.println("Test avec valeur normale");
        double m1 = lireMontant("150.5");
        System.out.println("Montant lu : " + m1);

        System.out.println("\n Test avec texte invalide ");
        double m2 = lireMontant("abc");
        System.out.println("Montant lu (défaut) : " + m2);

        System.out.println("\nTest avec montant negatif");
        try {
            double m3 = lireMontant("-50");
            System.out.println("Montant lu : " + m3);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

       
    }
}