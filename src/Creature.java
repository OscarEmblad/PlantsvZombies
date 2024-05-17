import java.util.ArrayList; // Importerar ArrayList-klassen för att använda dynamiska listor
import java.util.List; // Importerar List-interface för att deklarera listor
import java.util.Random; // Importerar Random-klassen för att generera slumpmässiga nummer
import java.util.Scanner; // Importerar Scanner-klassen för att läsa användarens input

// Abstrakt klass för alla varelser
abstract class Creature {
    protected int intelligence; // Variabel för intelligens
    protected int toughness; // Variabel för tålighet
    protected int strength; // Variabel för styrka
    protected static final Random rand = new Random(); // Slumpgenerator

    // Konstruktor för Creature som initierar egenskaperna
    public Creature(int intelligence, int toughness, int strength) {
        this.intelligence = intelligence;
        this.toughness = toughness;
        this.strength = strength;
    }

    // Metod för att spela schack, returnerar ett värde baserat på intelligens och ett slumpmässigt tal
    public int playChess() {
        return Math.min(20, intelligence + rand.nextInt(11)); // Slumptal mellan 0-10 plus intelligens, maxvärde 20
    }

    // Metod för brottning, returnerar ett värde baserat på tålighet, styrka och ett slumpmässigt tal
    public int wrestle() {
        return Math.min(20, toughness + strength + rand.nextInt(11)); // Slumptal mellan 0-10 plus tålighet och styrka, maxvärde 20
    }

    // Metod för armbrytning, returnerar ett värde baserat på styrka och ett slumpmässigt tal
    public int armWrestle() {
        return Math.min(20, strength + rand.nextInt(11)); // Slumptal mellan 0-10 plus styrka, maxvärde 20
    }

    // Överskriver toString-metoden för att ge en beskrivning av varelsernas egenskaper
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [Intelligence=" + intelligence + ", Toughness=" + toughness + ", Strength=" + strength + "]";
    }
}