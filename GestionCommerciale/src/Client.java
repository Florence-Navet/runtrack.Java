package src;

public class Client extends Personne{
    private double chiffreAffaire;

    public Client(int identite, String nomSocial, String adresse, double chiffreAffaire) {
        super(identite, nomSocial, adresse);
        this.chiffreAffaire = chiffreAffaire;
    }

    //Getter
    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    //setter

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Chiffre d'affaire : " + chiffreAffaire);
    }
}
