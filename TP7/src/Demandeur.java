import java.time.LocalDate;
import java.util.*;

public class Demandeur {
    private int numero;
    private String nom;
    private String prenom;
    private String numTel;
    private SortedSet<Reservation> lesReservations = new TreeSet<>((o1, o2) -> o1.getCreneau().compareTo(o2.getCreneau()));

    public Demandeur(int numero, String nom, String prenom, String numTel) {
        this.numero = numero;
        this.nom = nom;
        this.prenom = prenom;
        this.numTel = numTel;
    }

    public boolean ajouterReservation(Reservation reservation) {
        return lesReservations.add(reservation);
    }

    public Reservation rechercherReservation(int numReservation) {
         for (Reservation reservation : lesReservations) {
             if(reservation.getNumRes() == numReservation) {
                 return reservation;
             }
         }
         return null;
    }

    public boolean supprimerReservation(int numReservation) {
        for (Reservation reservation : lesReservations) {
            if(reservation.getNumRes() == numReservation) {
                lesReservations.remove(reservation);
                return true;
            }
        }
        return false;
    }

    public Reservation derniereReservation() {
        SortedSet<Reservation> tempRes=new TreeSet<>((o1,o2)-> o1.getNumRes()-o2.getNumRes());
        tempRes.addAll(lesReservations);
        return tempRes.last();
    }

    public List<Reservation> lesReservationsAVenir() {
        List<Reservation> res=new ArrayList<>();
        for (Reservation reservation : lesReservations) {
            if(reservation.getCreneau().getDate().isAfter(LocalDate.now())) {
                res.add(reservation);
            }
        }
        return res;
    }


}