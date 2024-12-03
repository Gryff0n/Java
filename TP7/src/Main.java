
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Salle salle1 = new Salle(101, 50);
        Salle salle2 = new Salle(102, 100);
        Salle salle3 = new Salle(103, 75);


        Creneau creneau1 = new Creneau(LocalDate.of(2024, 12, 1), 9);
        Creneau creneau2 = new Creneau(LocalDate.of(2024, 12, 1), 14);
        Creneau creneau3 = new Creneau(LocalDate.of(2024, 12, 2), 10);


        Reservation reservation1 = new Reservation(1, creneau1, salle1, 150.0);
        Reservation reservation2 = new Reservation(2, creneau2, salle2, 200.0);
        Reservation reservation3 = new Reservation(3, creneau3, salle3, 250.0);


        Demandeur demandeur = new Demandeur(123, "John", "Doe", "0123456789");
        demandeur.ajouterReservation(reservation1);
        demandeur.ajouterReservation(reservation2);
        demandeur.ajouterReservation(reservation3);


        System.out.println("All reservations for the demandeur:");
        for (Reservation res : demandeur.lesReservationsAVenir()) {
            System.out.println(res);
        }


        Reservation foundReservation = demandeur.rechercherReservation(2);
        System.out.println("\nFound Reservation with numRes 2: " + foundReservation);


        boolean removed = demandeur.supprimerReservation(1);
        System.out.println("\nRemoved reservation with numRes 1: " + removed);


        System.out.println("\nRemaining reservations for the demandeur after removal:");
        for (Reservation res : demandeur.lesReservationsAVenir()) {
            System.out.println(res);
        }

        Planning planning = new Planning();
        planning.RemplirPlanning(salle1, creneau1);
        planning.RemplirPlanning(salle2, creneau2);
        planning.RemplirPlanning(salle3, creneau3);


        System.out.println("\nAvailable salles for creneau2:");
        for (Salle salle : planning.rechercherSalleDispo(creneau2)) {
            System.out.println(salle);
        }


        Reservation lastReservation = demandeur.derniereReservation();
        System.out.println("\nLast reservation made by the demandeur: " + lastReservation);
    }
}

