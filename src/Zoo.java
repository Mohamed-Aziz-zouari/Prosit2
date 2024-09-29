import java.util.Arrays;

public class Zoo {
    Animal [] animals ;
    String name;
    String city;
    static final int nbrCages=25;

    public Zoo( String name, String city) {
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;

    }
    public  void displayZoo(){
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Nbr Cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    public boolean addAnimal(Animal animal){
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i]!=null && animal.name.equals(animals[i].name)  ) {
                return false;
            } else if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }


        }
        return false;
    }

    public void afficheAnimals(){
        for (int i = 0; i < nbrCages; i++) {
            if(animals[i] != null){
                System.out.println(animals[i].toString());
            }
        }
    }

    public int searchAnimal(Animal animal){
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i]==animal && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal){
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i]==animal ) {
                animals[i] = null;
                System.out.println("animal removed");
                for (int j = i ; j < nbrCages -1; j++) {
                    animals[j] = animals[j+1];
                }
                return true;
            }


        }
        return false;
    }

    public boolean isZooFull(){
        int nbAnimals =0;
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i]!=null) {
                nbAnimals = nbAnimals + 1;
            }
        }

        return (nbAnimals == nbrCages);
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2){
    int nbAnimalsZ1 =0;
    int nbAnimalsZ2 =0;
    for (int i = 0; i < nbrCages; i++) {
        if (z1.animals[i]!=null) {
            nbAnimalsZ1 = nbAnimalsZ1 + 1;
        }
        if (z2.animals[i]!=null) {
            nbAnimalsZ2 = nbAnimalsZ2 + 1;
        }
    }
    if (nbAnimalsZ1>nbAnimalsZ2) {
    return z1;
    }else  {
    return z2;
    }
    }

}
