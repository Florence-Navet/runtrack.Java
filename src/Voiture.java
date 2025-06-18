public class Voiture extends Vehicule{
    private int cylindree;
    private int nbPortes;
    private int puissance;
    private double kilometres;

    Voiture (String marque, String dateAchat, double prixAchat,
             int cylindree, int nbPortes, int puissance, double kilometres) {
        super(marque, dateAchat, prixAchat);
        this.cylindree = cylindree;
        this.nbPortes = nbPortes;
        this.puissance = puissance;
        this.kilometres = kilometres;
    }

    @Override
    public void afficher() {
        System.out.println("Cylindrée : " + cylindree + "cm3");
        System.out.println("Nombres de portes : " + nbPortes);
        System.out.println("Puissances : " + puissance + "ch");
        System.out.println("Kilométrages : " + kilometres + "km");
    }
}
