package src;
import java.util.Locale;


public class Article {
    private int reference;
    private String designation;
    private double prixUnitaire;
    private int quantiteStock;

    // Constructeur paramétré
    public Article(int reference, String designation, double prixUnitaire, int quantiteStock) {
        this.reference = reference;
        this.designation = designation;
        this.prixUnitaire = prixUnitaire;
        this.quantiteStock = quantiteStock;
    }

    // Getters
    public int getReference() {
        return reference;
    }

    public String getDesignation() {
        return designation;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    // Setters
    public void setReference(int reference) {
        this.reference = reference;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public void afficher() {
        System.out.println("--------Vos articles--------------");
        System.out.println("[Article Ref : " + reference + "]\n[Designation : " + designation +
                "]\n[Prix : " + prixUnitaire + "]\n[Stock : " + quantiteStock + "]");
    }

}

