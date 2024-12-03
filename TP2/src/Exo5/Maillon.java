package Exo5;

class Maillon {
    private String valeur;
    private Maillon suivant;

    public Maillon(String s, Maillon m) {
        valeur = s;
        suivant = m;
    }

    public String getValeur() {
        return valeur;
    }

    public Maillon getSuivant() {
        return suivant;
    }

    public void setSuivant(Maillon suivant) {
        this.suivant = suivant;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }
}