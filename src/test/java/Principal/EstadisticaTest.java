package Principal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadisticaTest {

    @Test
    @DisplayName("Test de la media")
    void media() {
        Estadistica aobj = new Estadistica();
        double datos [] = {10.0,11.0,10.0,9.0,10.0,10.0};
        assertEquals(10.0, aobj.media(datos));
    }

    @Test
    @DisplayName("Test de la varianza")
    void varianza() {
        Estadistica aobj = new Estadistica();
        double datos [] = {10.0,11.0,10.0,9.0,10.0,10.0};
        assertEquals(0.33, aobj.varianza(datos));
    }

    @Test
    @DisplayName("Test de la desviación típica")
    void desvEstandar() {
        Estadistica aobj = new Estadistica();
        double datos [] = {10.0,11.0,10.0,9.0,10.0,10.0};
        assertEquals(0.57, aobj.desvEstandar    (datos));
    }


}