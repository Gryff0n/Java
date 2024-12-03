package Exo1;

public class TestTriNuplets {
    public static void main(String[] args) {

        ListeNuplets liste = new ListeNuplets(3, 2, 4); // Exemple avec 3 n-uplets de tailles 3, 2 et 4

        // Afficher la liste avant le tri
        System.out.println("Liste avant le tri : " + liste);

        liste.trier();

        // Afficher la liste après le tri
        System.out.println("Liste après le tri : " + liste);


        int index = 1;
        ListeNuplets.Nuplets nuplet = liste.getNuplets(index);


        if (nuplet != null) {
            System.out.println("Nuplet à l'indice " + index + ": " + nuplet);
            System.out.println("Nombre d'éléments : " + nuplet.nbElements());
            System.out.print("Éléments : ");
            for (int i = 0; i < nuplet.nbElements(); i++) {
                System.out.print(nuplet.getElement(i) + " ");
            }
        } else {
            System.out.println("Aucun Nuplet trouvé à l'indice " + index);
        }
    }

}
