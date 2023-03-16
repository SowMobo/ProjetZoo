import org.testng.annotations.*;

import java.util.ArrayList;

public class TestZoo {
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

