package Exo4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ecrire un nombre: ");
        boolean valid=false;
        int n=0;
        while (!valid) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum+=i;
                }
                System.out.println(sum);
                valid=n==0;
            }
            else {
                scanner.next();
            }
        }
        System.out.println(n);
    }
}
