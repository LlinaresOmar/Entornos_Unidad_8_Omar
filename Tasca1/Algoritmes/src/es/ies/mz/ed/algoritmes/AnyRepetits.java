package es.ies.mz.ed.algoritmes;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que contiene el metodo para averiguar el numero de digitos de un anyo.
 */

public class AnyRepetits {

    /**
     * Constructor vacio
     */
    public AnyRepetits(){}

    /**
     * Metodo que recibe un anyo en long y lo convierte en String.
     * Crea un arrayList vacio de caracteres.
     * Recorre los caracteres del numero y si no existe en el arraylist lo añade.
     * @param any anyo a tratar para obtener el numero de caracteres repetidos.
     * @return el numero de los diferntes caracteres que componen el anyo.
     */

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
