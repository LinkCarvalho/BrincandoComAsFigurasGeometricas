import org.junit.Test;

import static org.junit.Assert.*;

public class RetanguloTest {

    @Test
    public void calcularArea() {
        Retangulo retangulo = new Retangulo(10, 5);
        double areaEsperada = 50.0;  // base * altura
        assertEquals("A área do retângulo deve ser 50.0", areaEsperada, retangulo.calcularArea(), 0.01);
    }

    @Test
    public void calcularPerimetro() {
        Retangulo retangulo = new Retangulo(10, 5);
        double perimetroEsperado = 30.0;  // 2 * (base + altura)
        assertEquals("O perímetro do retângulo deve ser 30.0", perimetroEsperado, retangulo.calcularPerimetro(), 0.01);
    }

    @Test
    public void testBaseAlturaNegativa(){
        assertThrows(IllegalArgumentException.class, () -> {
            new Retangulo(-5,-6);
        });
    }

}