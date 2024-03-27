import org.junit.Test;

import static org.junit.Assert.*;

public class QuadradoTest {

    @Test
    public void calcularArea() {
        Quadrado quadrado = new Quadrado(9);
        double area = 80; // o correto seria 81
        assertEquals("A area esperada é de 81cm²", area, quadrado.calcularArea() , 0.1);
    }

    @Test
    public void calcularPerimetro() {
        Quadrado quadrado = new Quadrado(4);
        double perimetro = 16;
        assertEquals("O perimetro esperado é de 16cms", perimetro, quadrado.calcularPerimetro(), 0.1);
    }

    @Test
    public void testLadoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Quadrado(-5);
        });
    }
}
