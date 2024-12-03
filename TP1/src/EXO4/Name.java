package EXO4;

public class Name {
    public static void main(String[] args) {
        int n = 27;
        int div = 2;
        for (int i=2; i<=n; i++) {
            if(n%i==0) {
                div = i;
                break;
            }
        }
        System.out.println(div);
    }
}