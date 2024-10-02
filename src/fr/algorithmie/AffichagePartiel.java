package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {
        int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

        // Affichage des entiers supérieurs à 3
        System.out.println("Affichage des entiers supérieurs à 3 :");
        for (int j : array) {
            if (j > 3) {
                System.out.println(j);
            }
        }

        // Affichage des entiers pairs
        System.out.println("Affichage des entiers pairs :");
        for (int j : array) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
    }
}
