package Exo3;

import java.time.LocalDate;

public class Responsable extends Employe{
    private String titre;
    private int pourcentagePrime;
    private Employe[] lesSubordonnes;


    public Responsable(String name, double baseSalary, LocalDate employmentDate, String titre, int pourcentagePrime, Employe... lesSubordonnes) {
        super(name, baseSalary, employmentDate);
        this.titre = titre;
        this.pourcentagePrime = pourcentagePrime;
        this.lesSubordonnes = lesSubordonnes;
    }

    public String toString() {
        String a = super.toString()+'\n'+titre+'\n'+pourcentagePrime+"\n----Subordonnés----\n";
        for(Employe e : lesSubordonnes)
            a+=e.toString()+'\n';
        a+="-------------------\n";
        return a;
    }

    public double calculSalaireBrutMensuel() {
        return super.calculSalaireBrutMensuel()+this.getBaseSalary()*pourcentagePrime/100;
    }
}
