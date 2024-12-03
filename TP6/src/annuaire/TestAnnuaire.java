package annuaire;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TestAnnuaire {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Annuaire annuaire = new Annuaire();

        System.out.print("Combien de personnes voulez-vous ajouter à l'annuaire ? ");
        int nombrePersonnes = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < nombrePersonnes; i++) {
            System.out.println("\nEntrez les informations de la personne #" + (i + 1) + " :");
            System.out.print("Nom : ");
            String nom = scanner.nextLine();
            System.out.print("Prénom : ");
            String prenom = scanner.nextLine();
            System.out.print("Civilité (1 = Mr, 2 = Mme, 3 = Mlle) : ");
            int civilite = scanner.nextInt();
            scanner.nextLine();
            Personne personne = new Personne(civilite, nom, prenom);
            System.out.print("Combien de numéros de téléphone pour cette personne ? ");
            int nbNumeros = scanner.nextInt();
            scanner.nextLine();


            NumTel[] numeros = new NumTel[nbNumeros];
            for (int j = 0; j < nbNumeros; j++) {
                System.out.println("\nEntrez les informations du numéro #" + (j + 1) + " :");

                System.out.print("Numéro (ex : 123456789) : ");
                int numero = scanner.nextInt();

                System.out.print("Type de numéro (T = Fixe professionnel, D = Fixe domicile, P = Portable, F = Fax) : ");
                char type = scanner.next().charAt(0);
                scanner.nextLine();

                NumTel numTel = new NumTel(numero, type);
                numeros[j]=numTel;

            }
            ListeNumTel listeNumTel = new ListeNumTel(numeros);
            annuaire.ajouterEntree(personne, listeNumTel);
            System.out.println("\nAjout de "+personne+" effectué avec succès.");
        }
        System.out.println("\nAnnuaire après ajout des personnes et leurs numéros :");
        System.out.println(annuaire);
    }
}
