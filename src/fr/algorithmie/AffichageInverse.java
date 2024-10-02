package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Affichage des éléments du tableau
        for (int j : array) {
            System.out.print(j + " ");
        }

        // Affichage inverse des éléments du tableau
        System.out.println();
        System.out.println("-------------------------");
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j] + " ");
        }

        // Copie du tableau
        int[] arrayCopy = array.clone();
        System.out.println();
        System.out.println("-------------------------");
        for (int j : arrayCopy) {
            System.out.print(j + " ");
        }
    }
}
