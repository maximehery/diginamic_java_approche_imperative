package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1));
        }

        System.out.println("-----------------------------");

        for (int i = 0; i < 20; i++) {
            System.out.println("Maxime HERY");
        }

        System.out.println("-----------------------------");

        for (int i = 2; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("-----------------------------");

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
