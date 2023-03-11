package ocp;

public class Charizard extends Pokemon{

    public Charizard(String name, int level, int hp) {
        super(name, level, hp);
    }

    @Override
    public void attack(String oppo) {
        System.out.println(getName() +"의 화염방사!");
    }

    @Override
    public void evolve() {
        System.out.println(getName() +"의 진화");
    }
}
