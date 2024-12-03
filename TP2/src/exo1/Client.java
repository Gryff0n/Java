package exo1;

public class Client {
    private int idClient;
    private String nom;
    private String prenom;
    private String societe;
    private boolean actif;
    private static int next_num;
    static {next_num=1;}
    {idClient=next_num; next_num+=1;}

    public Client(String nom) {
        this.nom = nom;
    }

    public int getIdClient() {
        return idClient;
    }

    public boolean getActif() {
        return actif;
    }

    public String getSociete() {
        return societe;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public Client(String nom, String prenom, String societe, boolean actif) {
        this(nom);
        this.actif = actif;
        this.prenom = prenom;
        this.societe = societe;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }
}
