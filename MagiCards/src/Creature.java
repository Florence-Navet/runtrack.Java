public class Creature extends Carte {
    private String nom;
    private int degats;
    private int vie;

    public Creature(String nom, int degats, int vie, int cout) {
        super(cout);
        this.nom = nom;
        this.degats = degats;
        this.vie = vie;
    }

    @Override
    public void afficher() {
        System.out.println("Créature - nom : " + nom + ", Dégâts : " + degats + ", Vie : " + vie + ", Coût : " + cout);
    }
}
