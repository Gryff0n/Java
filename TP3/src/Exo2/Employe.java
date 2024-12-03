package Exo2;

import java.time.LocalDate;

public class Employe {
    private String name;
    private int id;
    private double baseSalary;
    private LocalDate EmploymentDate;

    static int identifiant = 1;

    public Employe(String name, double baseSalary, LocalDate employmentDate) {
        this.name = name;
        this.id = identifiant++;
        this.baseSalary = baseSalary;
        this.EmploymentDate = employmentDate;
    }

    public String toString() {
        return name+"\n"+id+"\n"+baseSalary+"\n"+EmploymentDate.toString();
    }

    public double calculSalaireBrutMensuel() {
        if(java.time.temporal.ChronoUnit.YEARS.between(this.EmploymentDate, LocalDate.now())>=9) return baseSalary*1.04;
        if(java.time.temporal.ChronoUnit.YEARS.between(this.EmploymentDate, LocalDate.now())>=6) return baseSalary*1.07;
        if(java.time.temporal.ChronoUnit.YEARS.between(this.EmploymentDate, LocalDate.now())>=3) return baseSalary*1.1;
        return baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public int getId() {
        return id;
    }
}
