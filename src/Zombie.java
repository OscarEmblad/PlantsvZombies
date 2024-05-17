class Zombie extends Creature {
    // Eventuella attribut och metoder för Zombie-klassen
    public Zombie() {
        super(rand.nextInt(6), rand.nextInt(6) + 10, rand.nextInt(6) + 5); // Intelligens 0-5, Tålighet 10-15, Styrka 5-10
    }
}