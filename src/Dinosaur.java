class Dinosaur extends Creature {
    // Eventuella attribut och metoder för Dinosaur-klassen
    public Dinosaur() {
        super(rand.nextInt(6) + 10, rand.nextInt(6), rand.nextInt(6) + 10); // Intelligens 10-15, Tålighet 0-5, Styrka 10-15
    }
}