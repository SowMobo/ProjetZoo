import org.testng.annotations.Test;

public class TestEspece {
    @Test
    public void test01() {
        Espece espece1 = new Espece("Lion", "roar");
        Espece espece2 = new Espece("Oiseau", "cui-cui");
        Espece espece3 = new Espece("Ane", "hi-han");


        System.out.println("La premiére espéce est le : " + espece1.getNom() + " et son cri c'est : " + espece1.getCri());
        System.out.println("La deuxiéme espéce est le : " + espece2.getNom() + " et son cri c'est : " + espece1.getCri());
        System.out.println("La troisiéme espéce est le : " + espece3.getNom() + " et son cri c'est : " + espece1.getCri());
    }
}
