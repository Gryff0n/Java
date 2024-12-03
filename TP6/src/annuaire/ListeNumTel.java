package annuaire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListeNumTel {
    private List<NumTel> list = new ArrayList<>();

    public ListeNumTel(NumTel ... lesNums) {
        if (lesNums.length == 0) {throw new IllegalArgumentException("Liste nulle");}
        list.addAll(Arrays.asList(lesNums));
    }

    boolean isPresent(NumTel numTel) {
        return list.contains(numTel);
    }

    boolean ajouter(int index, NumTel num) {
        if (isPresent(num)) {
            return false;
        }
        list.add(index, num);
        return true;
    }
    boolean ajouterFin(NumTel num) {
        if (isPresent(num)) {
            return false;
        }
        list.add(num);
        return true;
    }

    java.util.Iterator<NumTel> iterator() {
        return list.iterator();
    }

    int nbNumeros() {
        return list.size();
    }

    NumTel numero(int index) {
        return list.get(index);
    }

    NumTel premierNumero() {
        return list.get(0);
    }

    boolean retirer(int num) {
        if(nbNumeros()<2) {throw new IllegalArgumentException("Opération non valide");}
        if(isPresent(numero(num))) {
            list.remove(numero(num));
            return true;
        }
        return false;
    }

    public String toString() {
        return list.toString();
    }
}
