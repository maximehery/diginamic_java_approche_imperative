package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] villes = {"Paris", "Lyon", "Marseille", "Strasbourg", "Nantes"};

        for (String ville : villes) {
            System.out.println(ville);
        }

        System.out.println("Longueur du tableau : " + villes.length);

        villes[3] = "Reims";

        for (String ville : villes) {
            System.out.println(ville);
        }
    }
}
