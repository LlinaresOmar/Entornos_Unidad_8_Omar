package es.ies.mz.ed.algoritmes;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que calcula la division de los factoriales de dos numeros.
 */

public class DivisorFactorials {

    /**
     * Constructor vacio
     */

    public DivisorFactorials(){}

    /**
     * El metodo calcula que numero es mayor.
     * Si es el primero calcula y añade a un arraylist unicamente
     * los factores no comunes y pasa a multiplicarlos para obetener el resultado.
     * Si el es el segundo, calcula y añade a un arraylist unicamente
     * los factores no comunes y pasa a divir 1 entre ellos para obetener el resultado.
     * @param num1 primer numero
     * @param num2 segundo numero
     * @return la division del factorial del primero num1
     * entre el factorial del segundo num2
     */

    public double divisio(int num1, int num2){
        double resultado = 1;

        if (num1 > num2){
            ArrayList<Integer> dividendo = calcularDiferencia(num2, num1);
            for (Integer i: dividendo) {
                resultado *= i;
            }
        } else {
            ArrayList<Integer> divisor = calcularDiferencia(num1, num2);
            for (Integer i: divisor) {
                resultado /= i;
            }
        }
        return resultado;
    }

    public ArrayList<Integer> calcularDiferencia(int menor, int mayor){
        ArrayList<Integer> diferencia = new ArrayList<>();
        for (int i = menor+1; i <= mayor; i++) {
            diferencia.add(i);
        }
        return diferencia;
    }
}
