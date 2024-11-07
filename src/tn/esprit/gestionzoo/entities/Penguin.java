package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth ;

    public Penguin(String family, String name, int age, boolean isMammmal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammmal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("A penguin is swimming");
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "swimmingDepth=" + swimmingDepth +
                ", habitat='" + habitat + '\'' +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + super.getAge() +
                ", isMammmal=" + isMammmal +
                '}';
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("A penguin eats meat");
    }
}
