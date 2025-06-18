public class Vehicule {
    protected String marque;
    protected int anneeAchat;
    protected double prixAchat;
    protected double prixCourant = 0.0;

    public Vehicule(String marque, int anneeAchat, double prixAchat) {
        this.marque = marque;
        this.anneeAchat = anneeAchat;
        this.prixAchat = prixAchat;
        // prixCourant commence à 0, pas besoin de le réaffecter ici
    }

    public void afficher() {
        System.out.println("Marque : " + marque);
        System.out.println("Date d'achat : " + anneeAchat);
        System.out.println("Prix d'achat : " + prixAchat + "€");
        System.out.println("Prix courant : " + prixCourant + "€");
    }

    public void calculePrix(int anneeActuelle) {
        int annees = anneeActuelle - anneeAchat;
        prixCourant = prixAchat - (prixAchat * 0.01 * annees);
        if (prixCourant < 0) prixCourant = 0;
    }
}
