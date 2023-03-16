import org.testng.annotations.Test;

public class TestAnimal {
    @Test
    public void test02() {
        Animal animal1 = new Animal("Simba", new Espece("Lion", "roar"));
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
}
