package es.ies.mz.ed.algoritmes;

import java.util.ArrayList;
import java.util.List;

public class AnyRepetits {

    public AnyRepetits(){}

    public int numRepetits(long any){
       int numRepetidos;
       String anyoString = Long.toString(any);
       List<Character> charUnicos = new ArrayList<>();

        for (int i = 0; i < anyoString.length(); i++) {
            if (!charUnicos.contains(anyoString.charAt(i))){
                charUnicos.add(anyoString.charAt(i));
            }
        }
        numRepetidos=charUnicos.size();
        return numRepetidos;
    }
}
