package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
        int[] arrayCopy = array.clone();

        for (int i = arrayCopy.length - 1; i >= 0; i--) {
            System.out.print(arrayCopy[i] + " ");
        }

        System.out.println();
        System.out.println("--------------------------");

        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
