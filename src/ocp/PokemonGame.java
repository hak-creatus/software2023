package ocp;

public class PokemonGame {
    public static void main()
    {
        Pokemon pika = new Pikachu("쥐돌이", 5, 15);
        Pikachu luck = new Pikachu("럭키꼬렛", 5, 15);

        pika.attack(luck.getName());
        pika.evolve();
    }
}