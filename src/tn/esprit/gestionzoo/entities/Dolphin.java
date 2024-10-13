package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    protected float swimmingSpeed ;

    public Dolphin(String family, String name, int age, boolean isMammmal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammmal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "swimmingSpeed=" + swimmingSpeed +
                ", habitat='" + habitat + '\'' +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammmal=" + isMammmal +
                '}';
    }

    public void swim (){
        System.out.println("This dolphin is swimming");
    }
}
