package Exo1;

public class Pile {
    private Maillon sommet;

    public Pile() {
    }

    public void empiler(String s){
        Maillon maillon = new Maillon(s, sommet);
        this.sommet = maillon;
    }
    public String depiler (){
        String temp = this.sommet.getValeur().toString();
        this.sommet = this.sommet.getSuivant();
        return temp;
    }
    public Maillon getSommet(){
        return this.sommet;
    }
    public boolean estVide(){
        return this.sommet == null;
    }

}
