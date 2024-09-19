public class Animal {
    String family;
    String name;
    int age;
    boolean isMammmal;

    public Animal(String family, String name, int age, boolean isMammmal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammmal = isMammmal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammmal=" + isMammmal +
                '}';
    }
}
