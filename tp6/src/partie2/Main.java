package partie2;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Client> file = new LinkedList<Client>();

        file.add(new Client(1, "Ahmed"));
        file.add(new Client(2, "Fatima"));
        file.add(new Client(3, "Youssef"));
        file.add(new Client(4, "Mohamed"));

    
        System.out.println("File d'attent");
        for (Client c : file) {
            System.out.println(c);
        }

      
        System.out.println("\n On sert le premier client ");
        Client premier = file.removeFirst();
        System.out.println("Servi : " + premier);

     
        System.out.println("\n Nouveau client ajouté ");
        file.addLast(new Client(5, "Hind"));
        System.out.println("Nouveau client ajouté en fin de file");

      
        System.out.println("\n Client en tête de file ");
        System.out.println("Prochain : " + file.getFirst());

        
        System.out.println("\n File d'attent finale");
        for (Client c : file) {
            System.out.println(c);
        }
    }
}