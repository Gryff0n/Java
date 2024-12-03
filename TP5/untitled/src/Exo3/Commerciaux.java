package Exo3;

import java.time.LocalDate;

public class Commerciaux extends Employe{

    private double venteDernierMois;

    public Commerciaux(String name, double baseSalary, LocalDate employmentDate, double venteDernierMois) {
        super(name, baseSalary, employmentDate);
        this.venteDernierMois = venteDernierMois;
    }
    public void setVenteDernierMois(double sales) {
        venteDernierMois = sales;
    }

    public String toString() {
        return super.toString()+'\n'+venteDernierMois+'\n';
    }

    public double calculSalaireBrutMensuel() {
        return super.calculSalaireBrutMensuel()+venteDernierMois*0.05;
    }
}
