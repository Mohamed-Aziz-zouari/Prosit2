package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal implements Carnivore <Food>{
    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammmal, String habitat) {
        super(family, name, age, isMammmal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                "habitat='" + habitat + '\'' +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + super.getAge() +
                ", isMammmal=" + isMammmal +
                '}';
    }

    public abstract void swim();
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj instanceof Aquatic aquatic) {
            return aquatic.habitat.equals(habitat) && aquatic.getName().equals(super.getName()) && aquatic.getAge() == super.getAge();
        }
        return false;
    }
}
