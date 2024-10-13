package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{
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
                ", age=" + age +
                ", isMammmal=" + isMammmal +
                '}';
    }
}
