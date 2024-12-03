package EXO5;

public class Main {
    public static void main(String[] args) {
        double a = 2;
        double b = Math.sqrt(2);
        double c = Math.sqrt(2);
        double maxi = Math.max(a,b);
        double[] the_others = new double[2];
        maxi = Math.max(maxi,c);
        if(maxi==a)
            the_others= new double[]{b, c};
        else if(maxi==b)
            the_others= new double[]{a, c};
        else
            the_others= new double[]{a, b};
        if(maxi>the_others[0]+the_others[1]){
            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH");
        }
        else {
            if(maxi==the_others[0] && maxi==the_others[1]){
                System.out.println("EQUILATERAAAAAAAAAAL");
            }
            else if(maxi==the_others[0] || maxi==the_others[1] || the_others[0]==the_others[1]){
                System.out.println("ISOCEEEEEEEEEEEEEEEEEELE");
            }
            if(((int)Math.pow(the_others[0],2)+(int)Math.pow(the_others[1],2)==(int)Math.pow(maxi,2))){
                System.out.println("RECTAAAAAAAAAAAAAAAAANGLE");
            }
        }
    }
}
