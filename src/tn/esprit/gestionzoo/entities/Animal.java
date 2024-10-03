package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammmal;

    public Animal(String family, String name, int age, boolean isMammmal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammmal = isMammmal;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammmal() {
        return isMammmal;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid Age");
        }else {
        this.age = age;}
    }

    public void setMammmal(boolean mammmal) {
        isMammmal = mammmal;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammmal=" + isMammmal +
                '}';
    }
}
