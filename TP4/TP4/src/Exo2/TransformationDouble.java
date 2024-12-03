package Exo2;

import java.lang.Math;

public class TransformationDouble {
    public static void main(String[] args) {
        Double[] D = {4.0, 65.0, 988.0, 33.0, 52.0, 48.0};
        EnsTransformable Obj1= new EnsTransformable(D);
        System.out.println("Avant transformation : " + Obj1);
        Obj1.transformer(o -> {return Math.sqrt((Double) o);});
        Obj1.transformer(o -> {return Math.pow((Double) o,2);});
        Obj1.transformer(o -> {return Math.pow((Double) o,3);});
        System.out.println("Après transformation : " + Obj1);
    }
}
