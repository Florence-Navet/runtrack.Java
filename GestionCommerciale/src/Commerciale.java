package src;

import java.util.Vector;

public class Commerciale {
    private Vector<Article> articles = new Vector<>();
    private Vector<Client> clients = new Vector<>();
    private Vector<Commande> commandes = new Vector<>();
    private Vector<Ligne> lignes = new Vector<>();

    //getter
    public Vector<Client> getClients() {
        return clients;
    }

    public Vector<Article> getArticles() {
        return articles;
    }

    public Vector<Commande> getCommandes() {
        return commandes;
    }

    public Vector<Ligne> getLignes() {
        return lignes;
    }





    public void passerCommande(Commande commande) {
        commandes.add(commande);
    }

    public void annulerCommmande(Commande commande) {
        commandes.remove(commande);
    }

    public void ajouterClient(Client client) {
        clients.add(client);
    }

    public void supprimerClient(Client client) {
        clients.remove(client);
    }

    public void ajouterArticle(Article article) {
        articles.add(article);
    }
    public void supprimerArticle(Article article) {
        articles.remove(article);
    }


}
