public class Animal {
    private String nom;
    private int age;
    private boolean vivant;
    private Espece espece;

    public Animal(String sonNom, Espece sonEspece) {
        this.nom = sonNom;
        this.espece = sonEspece;
        this.age = 0;
        this.vivant = true;
    }

    public String getNom() {
        return this.nom;
    }

    public boolean estVivant() {
        return this.vivant;

    }

    public Espece getEspece() {
        return this.espece;
    }

    public String toString() {
        String status = this.vivant ? "vivant" : "mort";
//        int age=this.vivant ? this.age : this.ageMort;
        return "Le nom de l'animal est " + this.nom +
                " Son espéce est " + this.espece +
                " il est " + status +
                " il a " + this.age + " an(s)";
    }

    /**
     * increment l'age de l'animal
     */
    public void vieillir() {
        if (this.vivant) {
            this.age += 1;
        }
    }

    /**
     * fait mourir l’animal s’il était vivant
     */
    public void mourir() {
        if (this.vivant) {
            this.vivant = false;
        }
    }
}
