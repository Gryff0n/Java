package Exo2;

import java.util.Arrays;

public class EnsTransformable {
    private Object[] ensemble;

    public EnsTransformable(Object[] ensemble) {
        this.ensemble = ensemble;
    }

    public String toString() {
        return Arrays.toString(ensemble);
    }

    public void transformer(Transformation f) {
        for (int i = 0; i < ensemble.length; i++) {
            ensemble[i] = f.transforme(ensemble[i]);
        }
    }

}
