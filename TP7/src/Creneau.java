import java.time.LocalDate;
import java.util.Objects;

public class Creneau {
    private LocalDate date;
    private int heureDebut;

    public Creneau(LocalDate date, int heureDebut) {
        this.date = date;
        this.heureDebut = heureDebut;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Creneau creneau = (Creneau) o;
        return heureDebut == creneau.heureDebut && Objects.equals(date, creneau.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, heureDebut);
    }

    public LocalDate getDate() {
        return date;
    }

    public String toString() {
        return date.toString() + " " + heureDebut;
    }

    public int compareTo(Creneau c) {
        if(date.compareTo(c.date) == 0) {
            return heureDebut - c.heureDebut;
        }
        return date.compareTo(c.date);
    }
}
