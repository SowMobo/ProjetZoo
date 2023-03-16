import org.testng.annotations.*;

import java.util.ArrayList;

public class TestZoo {
    @Test
    public void test01() {
        Espece espece1 = new Espece("Lion", "roar");
        Espece espece2 = new Espece("Oiseau", "cui-cui");
        Espece espece3 = new Espece("Ane", "hi-han");


        System.out.println("La premiére espéce est le : " + espece1.getNom() + " et son cri c'est : " + espece1.getCri());
        System.out.println("La deuxiéme espéce est le : " + espece2.getNom() + " et son cri c'est : " + espece1.getCri());
        System.out.println("La troisiéme espéce est le : " + espece3.getNom() + " et son cri c'est : " + espece1.getCri());
    }

   @Test
    public void test02() {
        Animal animal1 = new Animal("Simba",new Espece("Lion", "roar") );
        Animal animal2 = new Animal("Coco", new Espece("Oiseau", "cui-cui"));
        Animal animal3 = new Animal("Titi", new Espece("Ane", "hi-han"));
        Animal animal4 = new Animal("Bouriquet", new Espece("Ane", "hi-han"));

        animal1.vieillir();
        System.out.println(animal1);

        animal2.vieillir();
        animal2.vieillir();
        animal2.vieillir();
        animal2.vieillir();
        System.out.println(animal2);

        System.out.println(animal3);

        animal4.mourir();
        System.out.println(animal4);

        }

        @Test
        public void test03() {
            Zoo zoo = new Zoo("Arij");
            Animal animal1 = new Animal("Simba", new Espece("Lion", "roar"));
            Animal animal2 = new Animal("Coco", new Espece("Oiseau", "cui-cui"));
            zoo.ajouterAnimal(animal1);
            zoo.ajouterAnimal(animal2);

            ArrayList<String> criDeJoies = zoo.nourrir();
            for (String criDeJoie : criDeJoies) {
                System.out.println(criDeJoie);
            }
        }
}

