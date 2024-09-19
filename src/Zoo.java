import java.util.Arrays;

public class Zoo {
    Animal [] animals ;
    String name;
    String city;
    int nbrCages;

    public Zoo( String name, String city, int nbrCages) {
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public  void displayZoo(){
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Nbr Cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{" +

                " name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }


}
