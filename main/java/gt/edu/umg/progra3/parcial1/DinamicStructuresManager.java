package gt.edu.umg.progra3.parcial1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DinamicStructuresManager <T extends Comparable<?  super T>> {

    List<T> values = new ArrayList<>();

    public DinamicStructuresManager(List<T> values) {
        this.values = values;
    }

    public List<T> ordenar(){
    	Collections.sort(values);
        return values;
    }

    public List<T> ordenarInversa(){
    	Collections.sort(values, Collections.reverseOrder());
        return values;
    }
}