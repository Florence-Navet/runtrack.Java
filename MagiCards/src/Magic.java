public class Magic {
    public static void main (String[] args) {
        System.out.println("Bienvenue dans MagiCards !!");
        Jeu monJeu = new Jeu();

        monJeu.piocher(new Terrain('v'));
        monJeu.piocher(new Creature("Pokemon",20, 80, 100));
        monJeu.piocher(new Sortilege("Foudre","Electrocute son adversaire", 10));
        monJeu.piocher(new Terrain('B'));
        monJeu.piocher(new Creature("Magicienne Adeline",0, 150, 150));
        monJeu.piocher(new Sortilege("Guerisseuse ","Potion de soin", 80));


        monJeu.afficher();
        System.out.println("----Creation carte----");
        monJeu.jouer();
        monJeu.afficher();



    }
}
