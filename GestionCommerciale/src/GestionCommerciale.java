package src; // ← Ajoute ceci !

public class GestionCommerciale {
    public static void main(String[] args) {
        Client client = new Client(1, "Tristan", "7 rue Dr Martinenq",15000);
        Client client1 = new Client(1, "Julien", "7 rue Dr Martinenq",1200);
        client.afficher();
        client1.afficher();

        Article a = new Article(101, "Stylo bille", 1.5, 100);
        a.afficher();


    }
}
