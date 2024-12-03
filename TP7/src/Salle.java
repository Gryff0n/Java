import java.util.Objects;

public class Salle {
    private int numSalle;
    private int superficie;

    public Salle(int numSalle, int superficie){
        this.numSalle = numSalle;
        this.superficie = superficie;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Salle salle = (Salle) o;
        return numSalle == salle.numSalle && superficie == salle.superficie;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numSalle, superficie);
    }

    @Override
    public String toString() {
        return "Salle{" +
                "numSalle=" + numSalle +
                ", superficie=" + superficie +
                '}';
    }
}
