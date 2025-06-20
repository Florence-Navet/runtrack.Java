package src;

public class Commande {
    private int nrCommande;
    private String dateCommande;
    private Client client;

    public Commande(int nrCommande, String dateCommande, Client client) {
        this.nrCommande = nrCommande;
        this.dateCommande = dateCommande;
        this.client = client;
    }
    //getter
    public int getNrCommande() {
        return nrCommande;
    }
    public String getDateCommande() {
        return dateCommande;
    }
    public Client getClient() {
        return client;
    }

    //setter

    public void setNrCommande(int nrCommande) {
        this.nrCommande = nrCommande;
    }

    public void setDateCommande(String dateCommande) {
        this.dateCommande = dateCommande;
    }

    public void setClient(Client client) {
        this.client = client;
    }


}
