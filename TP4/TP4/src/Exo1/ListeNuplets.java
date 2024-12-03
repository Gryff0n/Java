package Exo1;

import java.util.Arrays;
import java.util.Scanner;

public class ListeNuplets {
    private Nuplets[] lesNuplets;

    public static class Nuplets implements Comparable<Nuplets> {
        private int[] content;
        private static Scanner scanner = new Scanner(System.in);

        public Nuplets(int k) {
            this.content = new int[k];
            for (int i = 0; i < k; i++) {
                int value = -1;
                while (value < 0) {
                    System.out.print("Entrez un entier positif pour l'élément " + (i + 1) + ": ");
                    if (scanner.hasNextInt()) {
                        value = scanner.nextInt();
                        if (value < 0) {
                            System.out.println("Erreur : veuillez entrer un entier positif.");
                        }
                    } else {
                        System.out.println("Erreur : veuillez entrer un entier valide.");
                        scanner.next(); // Consommer l'entrée non entière
                    }
                }
                this.content[i] = value;
            }
        }

        public String toString() {
            String a="";
            for(int n : content) {
                a=a+n+",";
            }
            a=a.substring(0,a.length()-1);
            return "("+ a + ")";
        }

        public int nbElements() {
            return content.length;
        }

        public int getElement(int index) {
            return content[index];
        }

        public int compareTo(Nuplets other) {
            int minLength = Math.min(this.content.length, other.content.length);

            // Compare element by element up to the length of the shortest n-uplet
            for (int i = 0; i < minLength; i++) {
                if (this.content[i] < other.content[i]) {
                    return -1;
                } else if (this.content[i] > other.content[i]) {
                    return 1;
                }
            }

            // If all elements up to minLength are equal, compare by length
            if (this.content.length < other.content.length) {
                return -1;
            } else if (this.content.length > other.content.length) {
                return 1;
            }

            return 0;
        }

    }

    public ListeNuplets(int...lesTailles) {
        this.lesNuplets = new Nuplets[lesTailles.length];
        for (int i = 0; i < lesTailles.length; i++) {
            this.lesNuplets[i] = new Nuplets(lesTailles[i]);
        }
    }

    public String toString() {
        String s ="";
        for(Nuplets n : lesNuplets) {
            s=s+n.toString()+",";
        }
        s=s.substring(0,s.length()-1);
        return "("+ s + ")";
    }

    public Nuplets getNuplets(int index) {
        if(index < 0 || index >= this.lesNuplets.length) {
            return null;
        }
        return lesNuplets[index];
    }

    public void trier() {
        Arrays.sort(lesNuplets);
    }

}
