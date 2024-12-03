package Exo1;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        int somme =0;
        int nbErreurs = 0;
        for (String arg : args){
            if(Pattern.matches("[+-]?\\d+",arg)) {
                somme+=Integer.parseInt(arg);
            }
            nbErreurs++;
        }
        System.out.println("Somme des arguments " + somme);
    }
}
