public class Personne {

    // Attributs publics
    public String nom;
    public String prenom;

    // Attributs protégés
    protected String dateNaissance;
    protected String lieuNaissance;

    // Attributs privés
    private String adresse;
    private String telephone;

    // Constructeur
    public Personne(String nom, String prenom, String dateNaissance, String lieuNaissance,
                    String adresse, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    // Getters pour les attributs privés
    public String getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    // Setters pour les attributs privés
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    // Méthode d'affichage
    public void afficherInfos() {
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Date de naissance : " + dateNaissance);
        System.out.println("Lieu de naissance : " + lieuNaissance);
        System.out.println("Adresse : " + adresse);
        System.out.println("Téléphone : " + telephone);
    }
}
