package Exo2;

import java.util.Scanner;

public class TransformationMinMaj {

    public static void main(String[] args) {
        String[] lesMots = {"Bonjour", "HIER","Aujourd'hui"};
        EnsTransformable Obj2 = new EnsTransformable(lesMots);
        System.out.println("Avant transformation : " + Obj2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez 'a' pour mettre en majuscule ou 'i' pour mettre en minuscule : ");
        char choix = scanner.next().charAt(0);

        if (choix == 'a') {
            Obj2.transformer(o -> ((String) o).toUpperCase());  // Transformation en majuscule
            System.out.println("Après transformation en majuscule : " + Obj2);
        } else if (choix == 'i') {
            Obj2.transformer(o -> ((String) o).toLowerCase());  // Transformation en minuscule
            System.out.println("Après transformation en minuscule : " + Obj2);
        } else {
            System.out.println("Choix invalide.");
        }

        scanner.close();
    }

}

