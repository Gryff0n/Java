import java.util.Objects;

public class Reservation {
    private int numRes;
    private Creneau creneau;
    private Salle s;
    private double montant;

    public Reservation(int numRes, Creneau creneau, Salle s, double montant) {
        this.numRes = numRes;
        this.creneau = creneau;
        this.s = s;
        this.montant = montant;
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public void setCreneau(Creneau creneau) {
        this.creneau = creneau;
    }

    public int getNumRes() {
        return numRes;
    }

    public void setNumRes(int numRes) {
        this.numRes = numRes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return numRes == that.numRes && Double.compare(montant, that.montant) == 0 && Objects.equals(creneau, that.creneau) && Objects.equals(s, that.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numRes, creneau, s, montant);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "numRes=" + numRes +
                ", creneau=" + creneau +
                ", s=" + s +
                ", montant=" + montant +
                '}';
    }
}
