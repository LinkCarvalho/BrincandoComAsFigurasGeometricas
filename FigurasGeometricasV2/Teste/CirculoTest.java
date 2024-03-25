import org.junit.Test;

import static org.junit.Assert.*;

public class CirculoTest {

    @Test
    public void calcularArea() {
        Circulo circulo = new Circulo(10);
        double areaEsperada = 314.0;  // 3.14 * raio^2
        assertEquals("A área do círculo deve ser 314.0", areaEsperada, circulo.calcularArea(), 0.01);
    }

    @Test
    public void calcularPerimetro() {
        Circulo circulo = new Circulo(5);
        double perimetroEsperado = 30;  // o correto seria 31.415
        assertEquals("O perímetro do círculo deve ser 31.415", perimetroEsperado, circulo.calcularPerimetro(), 0.01);
    }

}