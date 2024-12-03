package Exo3;

public class Personnel {

    private Employe[] employes;
    static int nb_employes;


    public Personnel() {
        this.employes = new Employe[1000];
        nb_employes = 0;
    }

    public Boolean ajouterEmploye(Employe e) {
        Boolean notIn = true;
        if(nb_employes > 0) {
            for(Employe emp : employes) {
                if(emp!=null && emp.equals(e))
                    return false;
            }
        }
        employes[nb_employes++] = e;
        return true;
    }

    public Employe rechercherEmploye(int id) {
        for(Employe emp : employes) {
            if(emp.getId()==id)
                return emp;
        }
        return null;
    }

    public double montantSalairesBrutsMensuels() {
        double salaires = 0;
        for(Employe emp : employes) {
            if(emp!=null)
                salaires+=emp.calculSalaireBrutMensuel();
        }
        return salaires;
    }

    public String toString() {
        String a = "";
        for(Employe emp : employes) {
            if(emp!=null)
                a+=emp.toString()+'\n';
        }
        return a;
    }
}
