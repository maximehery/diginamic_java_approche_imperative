package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        for (int j : array) {
            System.out.print(j + " ");
        }

        System.out.println();
        System.out.println("-------------------------------------");

        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j] + " ");
        }

        System.out.println();
        System.out.println("-------------------------------------");

        for (int i : array) {
            if (i > 3) {
                System.out.println(i);
            }
        }

        System.out.println();
        System.out.println("-------------------------------------");

        for (int i : array) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();
        System.out.println("-------------------------------------");

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }

        System.out.println();
        System.out.println("-------------------------------------");

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}
