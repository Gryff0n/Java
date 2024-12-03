package Exo3;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        int[] tab = {1 , 13 , 4 , 15 , 32 , 25};
        Predicate<Integer> plusGrandQue10 = x -> x > 10;
        Predicate<Integer> plusPetitQue20 = x -> x < 20;
        for(int i : tab) {
            if(plusGrandQue10.test(i)) {
                System.out.println(i);
            }
        }
        System.out.println("---------");
        for(int i : tab) {
            if(plusGrandQue10.and(plusPetitQue20).test(i)) {
                System.out.println(i);
            }
        }
    }
}
