package Exo2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Personnel personnel = new Personnel();

        Employe e1 = new Employe("Alice Dupont", 3000.00, LocalDate.of(2015, 5, 20));
        Employe e2 = new Employe("Bob Martin", 3200.00, LocalDate.of(2021, 3, 15));
        Employe e3 = new Employe("Charlie Lamar", 2800.00, LocalDate.of(2018, 8, 30));
        Employe e4 = new Employe("David Moreau", 2900.00, LocalDate.of(2017, 2, 14));
        Employe e5 = new Employe("Emma Bernard", 3100.00, LocalDate.of(2020, 6, 1));
        Employe e6 = new Employe("Frank Denis", 3300.00, LocalDate.of(2019, 10, 3));
        Employe e7 = new Employe("Georgia Leroy", 3400.00, LocalDate.of(2013, 4, 9));
        Employe e8 = new Employe("Hector Simon", 3050.00, LocalDate.of(2014, 7, 23));

        Commerciaux c1 = new Commerciaux("Irene Fabre", 3500.00, LocalDate.of(2016, 11, 1), 12000.00);
        Commerciaux c2 = new Commerciaux("Jacques Petit", 3700.00, LocalDate.of(2017, 1, 15), 15000.00);
        Commerciaux c3 = new Commerciaux("Kelly Dufour", 3600.00, LocalDate.of(2019, 5, 18), 9000.00);
        Commerciaux c4 = new Commerciaux("Leo Blanc", 3900.00, LocalDate.of(2022, 2, 25), 7000.00);

        // Managers/Responsables with subordinates
        Responsable r1 = new Responsable("Maria Dubois", 5000.00, LocalDate.of(2010, 3, 12), "Project Manager", 12, e1, e2, e3);
        Responsable r2 = new Responsable("Nathan Meunier", 5200.00, LocalDate.of(2008, 6, 18), "Senior Manager", 15, e4, e5, c1);
        Responsable r3 = new Responsable("Olivia Renault", 4800.00, LocalDate.of(2012, 9, 5), "Team Leader", 10, e6, c2, c3);

        personnel.ajouterEmploye(e1);
        personnel.ajouterEmploye(e2);
        personnel.ajouterEmploye(e3);
        personnel.ajouterEmploye(e4);
        personnel.ajouterEmploye(e5);
        personnel.ajouterEmploye(e6);
        personnel.ajouterEmploye(e7);
        personnel.ajouterEmploye(e8);
        personnel.ajouterEmploye(c1);
        personnel.ajouterEmploye(c2);
        personnel.ajouterEmploye(c3);
        personnel.ajouterEmploye(c4);
        personnel.ajouterEmploye(r1);
        personnel.ajouterEmploye(r2);
        personnel.ajouterEmploye(r3);

        System.out.println("All Employees:\n" + personnel.toString());

        System.out.println("Total Monthly Gross Salaries: " + personnel.montantSalairesBrutsMensuels());
    }
}
