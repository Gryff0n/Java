import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Planning {
    private Map<Salle, Set<Creneau>> planningSalle = new HashMap<>();

    public Planning() {
    }

    public void RemplirPlanning(Salle s, Creneau c) {
        /*if (!planningSalle.containsKey(s)) {
            Set<Creneau> tempCreneaux = new HashSet<>();
            tempCreneaux.add(c);
            planningSalle.put(s, tempCreneaux);
        }
        else {
            planningSalle.get(s).add(c);
        }*/
        planningSalle.computeIfAbsent(s, k -> new HashSet<>()).add(c);

    }

    public Set<Salle> rechercherSalleDispo( Creneau c) {
        Set<Salle> salles = new HashSet<>();
        for(Salle s: planningSalle.keySet()) {
            if(!planningSalle.get(s).contains(c)) {
                salles.add(s);
            }
        }
        return salles;
    }
}
