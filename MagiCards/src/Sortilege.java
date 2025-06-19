public class Sortilege extends Carte{
    private String nom;
    private String description;

    public Sortilege (String nom, String description, int count) {
        super(count);
        this.nom = nom;
        this.description = description;
    }

    @Override
    public void afficher() {
        System.out.println("Sortilège - Nom : " + nom +", Decription : " + description + ", Coût : " + cout);
    }
}

