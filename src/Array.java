public class Array {
    public static void AfficherTableau() {
        /*Écrire un programme java qui crée un tableau de 10 entiers qui stocke dans
    l’ordre les entiers de 0 à 9. Combien vaut T[0], T[1], T[5], T[9], T[10] ?*/
        int[] monTableau = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int nb0 = monTableau[0];
        int nb1 = monTableau[1];
        int nb2 = monTableau[5];
        int nb3 = monTableau[9];
        //int nb4 = monTableau[10]; erreur out of array

        // Affichage des résultats
        System.out.println("T[0] = " + nb0);
        System.out.println("T[1] = " + nb1);
        System.out.println("T[5] = " + nb2);
        System.out.println("T[9] = " + nb3);
        // System.out.println("T[10] = " + nb4);
    }
}
