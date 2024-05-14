package es.ies.mz.ed.algoritmes;

/**
 * Clase que contiene el metodo para averiguar si un numero es hyperpar o no
 */

public class Hyperpar {

    /**
     * Constructor vacio
     */
    public Hyperpar(){}

    /**
     * Metodo que separa cada cifra de un un numero convirtiendolo en un array de Strings de cada cifra.
     * Recorre todas las cifras del numero, y al encontrar una impar cambia su condicion de hyperpar.
     * @param numero numero que recibe el metdo para averguar si es hyperpar o no.
     * @return devuelver true si el numero es hyperpar y false si no lo es.
     */
    public boolean esHyperpar(long numero){
        boolean esHyper = true;
        String[] numPrtes = String.valueOf(numero).split("");
        for (String c:numPrtes) {
            if (Integer.parseInt(c) %2 != 0){
                esHyper = false;
                break;
            }
        }
        return esHyper;
    }


}
