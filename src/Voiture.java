public class Voiture extends Vehicule{
    private int cylindree;
    private int nbPortes;
    private int puissance;
    private double kilometres;

    Voiture (String marque,int anneeAchat, double prixAchat,
             int cylindree, int nbPortes, int puissance, double kilometres) {
        super(marque, anneeAchat, prixAchat);
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

    @Override
    public void calculePrix(int anneeActuelle) {
        int annees = anneeActuelle - anneeAchat;
        double prix = prixAchat;

        prix -= prix * 0.02 * annees; // 2% par an
        prix -= prix * 0.05 * (kilometres / 10000); // 5% par tranche de 10k km

        if (marque.equalsIgnoreCase("Renault") || marque.equalsIgnoreCase("Fiat")) {
            prix -= prix * 0.10;
        } else if (marque.equalsIgnoreCase("Ferrari") || marque.equalsIgnoreCase("Porsche")) {
            prix -= prix * 0.20;
        }

        prixCourant = (prix < 0) ? 0 : prix;
    }
}
