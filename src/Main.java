import java.util.Scanner;;
class ZooManagement {
    public static void main (String[] args){



        Animal lion = new Animal("Félins","simba" , 7, true);
        Zoo myZoo = new Zoo("zizouLand","tunis",60);
        myZoo.displayZoo();
        //c'est la representation de l'objet myZoo (ID)
        System.out.println(myZoo);
        //Zoo@568db2f2
        System.out.println(myZoo.toString());
        //Zoo@568db2f2
        //l'affichage de l'objet lion du classe Animal
        System.out.println(lion);
        System.out.println(lion.toString());
    }
}