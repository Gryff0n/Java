package Exo2;

import java.util.Scanner;

import static Exo2.Facto.factorielle;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Entrez un entier pour calculer sa factorielle (ou 'q' pour quitter) : ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Au revoir !");
                break;
            }
            try {
                int number = Integer.parseInt(input);
                if (number < 0 || number > 20) {
                    System.out.println("Veuillez entrer un entier positif ou nul inférieur a 20.");
                } else {
                    System.out.println("La factorielle de " + number + " est : " + factorielle(number));
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide. Veuillez saisir un entier valide ou 'q' pour quitter.");
            }
        }

        scanner.close();
    }
}
