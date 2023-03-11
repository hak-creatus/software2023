package ocp;

public class Pikachu extends Pokemon {

    public Pikachu(String name, int level, int hp) {
        super(name, level, hp);
        System.out.println("Pika! Pika!");
    }

    @Override
    public void attack(String oppo) {
        System.out.println(getName() +"의 10만 볼트!");
    }

    @Override
    public void evolve()
    {
        System.out.println(getName() +"의 진화");
    }
}
