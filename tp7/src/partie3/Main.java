package partie3;

public class Main {

    
    public static double lireMontant(String valeur) throws NumberFormatException, IllegalArgumentException {

      
        double montant = Double.parseDouble(valeur); 

        if (montant < 0) {
            throw new IllegalArgumentException("Montant négatif interdit !");
        }

        return montant;
    }

    public static void main(String[] args) {

        
        System.out.println("valeur normale");
        try {
            double m = lireMontant("200.0");
            System.out.println("Montant : " + m);
        } catch (NumberFormatException e) {
            System.out.println("Erreur de format : " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur métier : " + e.getMessage());
        }

        System.out.println("\n texte invalide ");
        try {
            double m = lireMontant("bonjour");
            System.out.println("Montant : " + m);
        } catch (NumberFormatException e) {
            System.out.println("Erreur de format : " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur métier : " + e.getMessage());
        }
    }
    }