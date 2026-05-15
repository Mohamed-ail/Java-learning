package partie1;


public class Main {

   
    public static double effectuerPaiement(double montant, double solde) {

        
        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant doit etre positif !");
        }

        
        if (montant > solde) {
            throw new ArithmeticException("Solde insuffisant !");
        }

        
        double nouveauSolde = solde - montant;
        return nouveauSolde;
    }

    public static void main(String[] args) {

        double solde = 500.0;

   
        System.out.println("Test paiement normal ");
        try {
            double result = effectuerPaiement(200.0, solde);
            System.out.println("Paiement reussi ! Nouveau solde : " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : montant invalide - " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Erreur : solde insuffisant - " + e.getMessage());
        } finally {
            
            System.out.println("Fin de la transaction");
        }

        System.out.println();

        System.out.println("Test paiement montant négatif ");
        try {
            double result = effectuerPaiement(-50.0, solde);
            System.out.println("Paiement russi ! Nouveau solde : " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : montant invalide - " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Erreur : solde insuffisant - " + e.getMessage());
        } finally {
            System.out.println("Fin de la transaction");
        }

        System.out.println();

        
        System.out.println(" Test paiement solde insuffisant");
        try {
            double result = effectuerPaiement(1000.0, solde);
            System.out.println("Paiement russi Nouveau solde : " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : montant invalide - " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Erreur : solde insufisant - " + e.getMessage());
        } finally {
            System.out.println("Fin de la transaction");
        }
        }
    }