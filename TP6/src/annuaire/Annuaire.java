package annuaire;

import java.util.*;

public class Annuaire {
   private SortedMap<Personne,ListeNumTel> annuaire;

   public Annuaire() {
       annuaire = new TreeMap<>();
   }

    boolean ajouterEntree(Personne p, ListeNumTel nums) {
       if(!annuaire.containsKey(p)) {
           annuaire.put(p, nums);
           return true;
       }
       return false;
    }

    ListeNumTel numeros(Personne p){
       if(annuaire.containsKey(p)) {
           return annuaire.get(p);
       }
       return null;
    }

    java.util.Iterator <Personne> personne() {
       return annuaire.keySet().iterator();
    }

    void ajouterNumeroFin(Personne p, NumTel n) {
       if(!annuaire.containsKey(p)) {
           annuaire.put(p, new ListeNumTel(n));
       }
    }

    public NumTel premierNumero (Personne p) {
       if(!annuaire.containsKey(p)) {
           return null;
       }
       return annuaire.get(p).premierNumero();
    }

    public void supprimer (Personne p) {
       annuaire.remove(p);
    }

    public void supprimerNumero (int n, Personne p) {
       if(!annuaire.containsKey(p)) {
           return;
       }
       if(annuaire.get(p).nbNumeros()==1){
           annuaire.remove(p);
       }
       else {
           NumTel fake = new NumTel(n);
           Iterator<NumTel> ite = annuaire.get(p).iterator();
           while(ite.hasNext()) {
               NumTel num = ite.next();
               if(num.equals(fake)) {
                   ite.remove();
               }
           }
       }

    }

    public Set<Personne> lesEntreesPour (String nom) {
       Iterator<Personne> ite = personne();
       Set<Personne> set = new HashSet<Personne>();
       while(ite.hasNext()) {
           Personne p = ite.next();
           if(p.getNom_().equals(nom)) {
               set.add(p);
           }
       }
       return set;

    }
    public String toString () {
       StringBuilder sb = new StringBuilder();
       for(Personne p : annuaire.keySet()) {
           sb.append(p.toString()).append(annuaire.get(p).toString());
           sb.append("\n");
       }
       return sb.toString();
    }
}
