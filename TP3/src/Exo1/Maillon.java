package Exo1;

class Maillon {
    private Object valeur;
    private Maillon suivant;

    public Maillon(Object s, Maillon m) {
        valeur = s;
        suivant = m;
    }

    public Object getValeur() {
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

