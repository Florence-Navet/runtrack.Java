public class Avion extends Vehicule {
    private String typeMoteur;
    private int heuresVol;

    public Avion(String marque, int anneeAchat, double prixAchat,
                 String typeMoteur, int heuresVol) {
        super(marque, anneeAchat, prixAchat);
        this.typeMoteur = typeMoteur;
        this.heuresVol = heuresVol;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Type de moteur : " + typeMoteur);
        System.out.println("Heures de vol : " + heuresVol + " h");
    }


    @Override
    public void calculePrix(int anneeActuelle) {

        double prix = prixAchat;
        if (typeMoteur.equalsIgnoreCase("HELICES")) {
            prix -= prix * 0.10 * (heuresVol / 100);
        } else {
            prix -= prix * 0.10 * (heuresVol / 1000);
        }

        prixCourant = (prix < 0) ? 0 : prix;
    }
    }


