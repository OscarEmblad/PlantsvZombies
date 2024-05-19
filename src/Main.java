import java.util.ArrayList; // Importera ArrayList klassen för att använda dynamiska listor
import java.util.List; // Importera List interface för att deklarera listor
import java.util.Random; // Importera Random klassen för att generera slumpmässiga nummer (om det behövs senare)
import java.util.Scanner; // Importera Scanner klassen för att läsa användarens input

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Skapa en ny Scanner för att läsa användarens input

        // Fråga användaren hur många zombier laget ska innehålla och läs in värdet
        System.out.print("Hur många ska det finnas i zombie-laget? ");
        int numZombies = scanner.nextInt();

        // Fråga användaren hur många dinosaurier laget ska innehålla och läs in värdet
        System.out.print("Hur många ska det finnas i dinosaurie-laget? ");
        int numDinosaurs = scanner.nextInt();

        // Skapa listor för att lagra zombier och dinosaurier
        List<Zombie> zombies = new ArrayList<>();
        List<Dinosaur> dinosaurs = new ArrayList<>();

        // Lägg till nya Zombie-objekt till zombielistan baserat på användarens input
        for (int i = 0; i < numZombies; i++) {
            zombies.add(new Zombie());
        }

        // Lägg till nya Dinosaur-objekt till dinosaurielistan baserat på användarens input
        for (int i = 0; i < numDinosaurs; i++) {
            dinosaurs.add(new Dinosaur());
        }

        // Skriv ut alla zombier
        System.out.println("Zombier:");
        for (Zombie z : zombies) {
            System.out.println(z);
        }

        // Skriv ut alla dinosaurier
        System.out.println("\nDinosaurier:");
        for (Dinosaur d : dinosaurs) {
            System.out.println(d);
        }

        scanner.close(); // Stäng scannern för att frigöra resurser
    }
}

