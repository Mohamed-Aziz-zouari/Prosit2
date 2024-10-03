package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

class ZooManagement {
    public static void main (String[] args){



        Animal lion = new Animal("Félins","Simba" , 7, true);
        Animal tiger = new Animal("Félins","Dekster" , 5, true);
        Animal giraffe = new Animal("Girafidés", "Geoffrey", 10, true);
        Animal elephant = new Animal("Éléphantidés", "Dimba", 12, true);

        Animal giraffe2 = new Animal("Girafidés", "Geoffrey", 10, true);

        Zoo myZoo = new Zoo("zizouLand","tunis");

         myZoo.addAnimal(lion);
         myZoo.addAnimal(tiger);
         myZoo.addAnimal(giraffe);
         myZoo.addAnimal(elephant);

         myZoo.afficheAnimals();
         int index = myZoo.searchAnimal(giraffe);
         System.out.println(index);

         index = myZoo.searchAnimal(giraffe2);
         System.out.println(index);

         boolean test = myZoo.addAnimal(giraffe2);
         System.out.println(test);

         boolean remove = myZoo.removeAnimal(tiger);
         myZoo.afficheAnimals();
         index = myZoo.searchAnimal(giraffe);
         System.out.println(index);

         boolean isFull = myZoo.isZooFull();
         System.out.println(isFull);

        Zoo myZoo2 = new Zoo("ZooLand","Ariana");
        myZoo2.addAnimal(elephant);
        myZoo2.addAnimal(tiger);

        Zoo comparer = Zoo.comparerZoo(myZoo, myZoo2);
        System.out.println(comparer);

//        myZoo.displayZoo();
//        //c'est la representation de l'objet myZoo (ID)
//        System.out.println(myZoo);
//        //tn.esprit.gestionzoo.entities.Zoo@568db2f2e
//        System.out.println(myZoo.toString());
//        //tn.esprit.gestionzoo.entities.Zoo@568db2f2
//        //l'affichage de l'objet lion du classe tn.esprit.gestionzoo.entities.Animal
//        System.out.println(lion);
//        System.out.println(lion.toString());
    }


}