package Exo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

public class MainBis {
    public static void main(String[] args) {
        Personnel personnel = new Personnel();

        try {

            Scanner sc = new Scanner(new File("/home/o22303698/Téléchargements/TP5/untitled/src/Exo3/employes.txt"));


            while (sc.hasNextLine()) {
                String ligne = sc.nextLine();

                String[] tokens = ligne.split(" ");

                String nom = tokens[0];
                double salaireBase = Double.parseDouble(tokens[1]);
                int annee = Integer.parseInt(tokens[2]);
                int mois = Integer.parseInt(tokens[3]);
                int jour = Integer.parseInt(tokens[4]);

                LocalDate dateEmbauche= LocalDate.of(annee, mois, jour);

                Employe employe = new Employe(nom, salaireBase, dateEmbauche);
                personnel.ajouterEmploye(employe);
            }

            System.out.println(personnel);

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("Le fichier employes.txt n'a pas été trouvé.");
        }
    }
}
