package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] array = {8, -7, 12, 1, -2, 14, 17, 9};

        System.out.println(array[0]);
        System.out.println(array.length);
        System.out.println(array[array.length - 1]);
        System.out.println(array[10]); // Retourne une erreur car l'index 10 n'existe pas dans le tableau
    }
}
