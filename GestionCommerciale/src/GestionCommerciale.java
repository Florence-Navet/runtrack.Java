package src;

import java.util.Scanner;
import java.util.Locale;


public class GestionCommerciale {
    private static Scanner scanner = new Scanner(System.in);
    private static Commerciale gestion = new Commerciale();

    public static void main(String[] args) {
        boolean continuer = true;
        while (continuer) {
            System.out.println("\n+++++++ MENU GESTION COMMERCIALE +++++++");
            System.out.println("1. Ajouter un client");
            System.out.println("2. Ajouter un article");
            System.out.println("3. Supprimer un client");
            System.out.println("4. Supprimer un article");
            System.out.println("5. Afficher tous les clients");
            System.out.println("6. Afficher tous les articles");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1 -> ajouterClient();
                case 2 -> ajouterArticle();
                case 3 -> supprimerClient();
                case 4 -> supprimerArticle();
                case 5 -> afficherClients();
                case 6 -> afficherArticles();
                case 0 -> {
                    continuer = false;
                    System.out.println("Fermeture du programme.");
                }
                default -> System.out.println("Choix invalide !");
            }
        }
        scanner.close();
    }

    //pour ajouter  ou supprimer un client

    private static void ajouterClient() {
        System.out.print("ID : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nom social : ");
        String nom = scanner.nextLine();

        System.out.print("Adresse : ");
        String adresse = scanner.nextLine();

        System.out.print("Chiffre d'affaires : ");
        double ca = scanner.nextDouble();
        scanner.nextLine();

        Client client = new Client(id, nom, adresse, ca);
        gestion.ajouterClient(client);
        System.out.println("Client ajouté !");
    }


    private static void supprimerClient() {
        System.out.print("ID du client à supprimer : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Client clientASupprimer = null;
        for (Client cl : gestion.getClients()) {
            if (cl.getIdentite() == id) {
                clientASupprimer = cl;
                break;
            }
        }

        if (clientASupprimer != null) {
            gestion.supprimerClient(clientASupprimer);
            System.out.println("Client supprimé.");
        } else {
            System.out.println("Client non trouvé.");
        }
    }
    // pour ajouter ou supprimer un article
    private static void ajouterArticle() {
        System.out.print("Référence : ");
        int ref = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Désignation : ");
        String designation = scanner.nextLine();

        System.out.print("Prix unitaire : ");
        double prix = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Quantité en stock : ");
        int stock = scanner.nextInt();
        scanner.nextLine();

        Article article = new Article(ref, designation, prix, stock);
        gestion.ajouterArticle(article);
        System.out.println("Article ajouté !");
    }


    private static void supprimerArticle() {
        System.out.print("Référence de l'article à supprimer : ");
        int ref = scanner.nextInt();
        scanner.nextLine();

        Article articleASupprimer = null;
        for (Article art : gestion.getArticles()) {
            if (art.getReference() == ref) {
                articleASupprimer = art;
                break;
            }
        }

        if (articleASupprimer != null) {
            gestion.supprimerArticle(articleASupprimer);
            System.out.println("Article supprimé.");
        } else {
            System.out.println("Article non trouvé.");
        }
    }

    //pour afficher la liste des  clients
    private static void afficherClients() {
        System.out.println("Liste des clients :");
        for (Client cl : gestion.getClients()) {
            cl.afficher();
        }
    }

    //oour afficher la liste de tous les articles

    private static void afficherArticles() {
        System.out.println("Liste des articles :");
        for (Article art : gestion.getArticles()) {
            art.afficher();
        }
    }
}
