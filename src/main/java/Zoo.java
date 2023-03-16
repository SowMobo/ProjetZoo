import java.util.ArrayList;

public class Zoo {
    private String directeur;
    private ArrayList<Animal> animals;

    public Zoo(String sonDirecteur) {
        this.directeur = sonDirecteur;
        this.animals = new ArrayList<Animal>(); //Creation d'un tableau de type animal
    }

    /**
     * @param nouvelAnimal
     * ajoute nouvelAnimal à la collection d’animaux du zoo courant
     */
    public void ajouterAnimal(Animal nouvelAnimal) {
        animals.add(nouvelAnimal); //Ajout d animal
    }

    /**
     *
     * @return une liste contenant des chaînes de caractères.
     * Chaque chaîne de caractères contient le nom de l’animal et le cri (de joie)
     * qu’il a poussé lorsqu’on l’a nourri
     * Note: les animaux morts ne crient pas et ne mangent pas).
     */
    public ArrayList<String> nourrir() {
        ArrayList<String> criDeJoie = new ArrayList<String>(); //creation d un tableau de type chaine de caractere qui regroupe les cries d'animeaux
        for (Animal animal : this.animals) {
            if (animal.estVivant()) {
                criDeJoie.add(animal.getNom() + " pousse " + animal.getEspece().getCri());
            }
        }
        return criDeJoie;
    }
}

