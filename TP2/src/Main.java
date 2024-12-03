import exo1.Client;


public class Main {
    public static void main(String[] args) {

    }
    public static void E1(){
        Client client = new Client("Dupont", "Dupond","T&D",true);
        System.out.println(client.getIdClient());
        System.out.println(client.getNom());
        System.out.println(client.getPrenom());
        System.out.println(client.getSociete());
        System.out.println(client.getActif());
        Client client2 = new Client("Dupond", "Dupont","D&T",true);
        System.out.println(client2.getIdClient());
        System.out.println(client2.getNom());
        System.out.println(client2.getPrenom());
        System.out.println(client2.getSociete());
        System.out.println(client2.getActif());
    }
}