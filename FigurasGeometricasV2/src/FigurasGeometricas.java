public class FigurasGeometricas {
    private Quadrado quadrado;
    private Circulo circulo;
    private Retangulo retangulo;

    public FigurasGeometricas() {
        quadrado = new Quadrado();
        circulo = new Circulo();
        retangulo = new Retangulo();
    }

    public Quadrado getQuadrado() {
        return quadrado;
    }

    public Circulo getCirculo() {
        return circulo;
    }

    public Retangulo getRetangulo() {
        return retangulo;
    }

    public String getAtributosTodasFiguras() {
        return quadrado.toString() + "\n" + circulo.toString() + "\n" + retangulo.toString();
    }


}
