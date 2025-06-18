public class Avion extends Vehicule {
    private String typeMoteur;
    private int heuresVol;

    public Avion(String marque, String dateAchat, double prixAchat,
                 String typeMoteur, int heuresVol) {
        super(marque, dateAchat, prixAchat);
        this.typeMoteur = typeMoteur;
        this.heuresVol = heuresVol;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Type de moteur : " + typeMoteur);
        System.out.println("Heures de vol : " + heuresVol + " h");
    }
}
