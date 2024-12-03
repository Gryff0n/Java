package Exo2;

public class TransformationType {

    public static void main(String[] args) {
        Object[] D = {4.0, 65.0, 988.0, 33.0, 52.0, 48.0};
        EnsTransformable Obj3= new EnsTransformable(D);
        System.out.println("Avant transformation : " + Obj3);
        Obj3.transformer(o -> (o.toString()));
        System.out.println("Après transformation : " + Obj3);
        //il a fallu changer le type de D de Double[] a Object[] pour enlever l'erreur
    }
}
