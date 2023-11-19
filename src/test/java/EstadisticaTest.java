import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstadisticaTest {

    private Estadisticas estadisticas = new Estadisticas();

    @Test
    public void mayorNumeroNull(){
        int[] lista = {};
        int resultado = estadisticas.mayorNumero(lista);
        assertEquals(0, resultado);
    }

    @Test
    public void mayorNumero(){
        int[] lista = {1, 4, 6, 3, 2};
        int resultado = estadisticas.mayorNumero(lista);
        assertEquals(6, resultado);
    }

    @Test
    public void promedioNull(){
        int[] lista = {};
        int resultado = estadisticas.promedio(lista);
        assertEquals(0, resultado);
    }

    @Test
    public void promedio() {
        int[] lista = {1, 4, 6, 3, 2};
        int resultado = estadisticas.promedio(lista);
        assertEquals(3, resultado);
    }

    @Test
    public void ordenarAreglo(){
        int[] lista = {2, 4, 1 , 2, 5, 3};
        int[] esperado = {1, 2, 2, 3, 4, 5};

        int[] resultado = estadisticas.ordenar(lista);

        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void ordenarAregloVacio(){
        int[] lista = {};
        int[] esperado = {};

        int[] resultado = estadisticas.ordenar(lista);

        assertArrayEquals(esperado, resultado);
    }
}
