package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        // Affichage de tous les nombres de 1 a 10
        System.out.println("---------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println("Affichage de tous les nombres de 1 a 10 : " + (i + 1));
        }

        // Affichage de tous les nombres pairs de 0 a 10
        System.out.println("---------------------------------------");
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println("Affichage de tous les nombres pairs de 0 a 10 : " + i);
            }
        }

        // Affichage de tous les nombres impairs de 0 a 9
        System.out.println("---------------------------------------");
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println("Affichage de tous les nombres impairs de 0 a 9 : " + i);
            }
        }

        // Affichage de tous les nombres de 1 à 10
        System.out.println("---------------------------------------");
        int i = 0;
        while (i < 10) {
            System.out.println("Affichage de tous les nombres de 1 à 10 : " + (i + 1));
            i++;
        }

        // Affichage de tous les nombres pairs de 0 à 10
        System.out.println("---------------------------------------");
        int j = 0;
        while (j < 11) {
            if (j % 2 == 0) {
                System.out.println("Affichage de tous les nombres pairs de 0 à 10 : " + j);
            }
            j++;
        }

        // Affichage de tous les nombres impairs de 0 à 9
        System.out.println("---------------------------------------");
        int k = 0;
        while (k < 10) {
            if (k % 2 != 0) {
                System.out.println("Affichage de tous les nombres impairs de 0 à 9 : " + k);
            }
            k++;
        }
    }
}
