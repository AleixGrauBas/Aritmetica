package Principal;

import static java.lang.Math.sqrt;

public class Estadistica {
    public static double media(double [] datos){
        double suma = 0;

        for (double i : datos)
            suma += i;

        return suma/datos.length;
    }

    public static double varianza(double [] datos){
        double suma = 0;
        double media = media(datos);
        for (double i : datos)
            suma += (i - media) * (i-media);
        double res = suma/datos.length;
        return Math.floor(res*100.0)/100.0;
    }

    public static double desvEstandar(double [] datos){
        double varianza = varianza(datos);
        return Math.floor(sqrt(varianza)*100.0)/100.0;
    }
}
