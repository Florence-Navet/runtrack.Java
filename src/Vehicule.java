public class Vehicule {
private String marque;
private String dateAchat;
private double prixAchat;
private double prixCourant = 0.0;

public Vehicule(String marque, String dateAchat, double prixAchat, double prixCourant) {
    this.marque =  marque;
    this.dateAchat = dateAchat;
    this.prixAchat = prixAchat;
    this.prixCourant = prixCourant;

}
 public void afficher() {
    System.out.println("Marque : " + marque);
    System.out.println("Date d'achat : " + dateAchat);
    System.out.println("Prix d'achat : " + prixAchat + "€");
    System.out.println("Prix courant : " + prixCourant + "€");
 }
}
