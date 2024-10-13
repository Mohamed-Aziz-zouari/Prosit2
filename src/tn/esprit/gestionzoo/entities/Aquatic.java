package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal{
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
                ", age=" + age +
                ", isMammmal=" + isMammmal +
                '}';
    }

    public void swim(){
        System.out.println("This aquatic animal is swimming");
    }
}
