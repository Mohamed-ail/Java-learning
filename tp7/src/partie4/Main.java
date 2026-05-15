package partie4;


public class Main {

    
    public static double lireTransaction(double[] tab, int index) {
        double valeur = tab[index]; 
        return valeur;
    }

    public static void main(String[] args) {

       
        double[] transactions = {100.0, 250.5, 75.0, 400.0};

        
        System.out.println("Accès normal ");
        try {
            double val = lireTransaction(transactions, 2);
            System.out.println("Transaction[2] = " + val);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur : l'indice est invalide !");
        } catch (NullPointerException e) {
            System.out.println("Erreur : le tableau n'est pas initialisé !");
        }

        System.out.println("\nIndice invalide");
        try {
            double val = lireTransaction(transactions, 10); 
            System.out.println("Transaction[10] = " + val);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur : l'indice est invalide !");
        } catch (NullPointerException e) {
            System.out.println("Erreur : le tableau n'est pas initialisé !");
        }

        System.out.println("\nTableau null ");
        try {
            double val = lireTransaction(null, 0);
            System.out.println("Valeur = " + val);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur : l'indice est invalide !");
        } catch (NullPointerException e) {
            System.out.println("Erreur : le tableau n'est pas initialisé !");
        }}
    }
