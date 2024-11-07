package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore <Food>{
    protected int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammmal, int nbrLegs) {
        super(family, name, age, isMammmal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestrial{" +
                "nbrLegs=" + nbrLegs +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + super.getAge() +
                ", isMammmal=" + isMammmal +
                '}';
    }

    @Override
    public void eatPlantAndMeet(Food food) {
        System.out.println("EatPlantAndMeet");
    }

    @Override
    public void eatMeat(Object meat) {
        System.out.println("EatMeat");
    }

    @Override
    public void eatPlant(Object plant) {
        System.out.println("EatPlant");
    }
}
