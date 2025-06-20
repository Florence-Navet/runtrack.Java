package src;

public class Ligne {
    private Commande commande;
    private Article article;
    private int qtCommande;

    public Ligne(Commande commande, Article article, int qtCommande) {
        this.commande = commande;
        this.article = article;
        this.qtCommande = qtCommande;
    }

    //getter

    public Commande getCommande() {
        return commande;
    }

    public Article getArticle() {
        return article;
    }

    public int getQtCommande() {
        return qtCommande;
    }

    //setter

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public void setQtCommande(int qtCommande) {
        this.qtCommande = qtCommande;
    }


}
