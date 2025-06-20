package src;

abstract class Personne {
    protected int identite;
    protected String nomSocial;
    protected String adresse;

    // Constructeur
    public Personne(int identite, String nomSocial, String adresse) {
        this.identite = identite;
        this.nomSocial = nomSocial;
        this.adresse = adresse;
    }

    // Getters
    public int getIdentite() {
        return identite;
    }

    public String getNomSocial() {
        return nomSocial;
    }

    public String getAdresse() {
        return adresse;
    }

    // Setters
    public void setIdentite(int identite) {
        this.identite = identite;
    }

    public void setNomSocial(String nomSocial) {
        this.nomSocial = nomSocial;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Méthode d'affichage
    public void afficher() {
        System.out.println("ID : " + identite + "\nNom social : " + nomSocial + "\nAdresse : " + adresse);
    }
}
