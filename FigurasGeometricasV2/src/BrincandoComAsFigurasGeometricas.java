public class BrincandoComAsFigurasGeometricas {
    public static void main(String[] args) {

        FigurasGeometricas figurasGeometricas = new FigurasGeometricas();
        figurasGeometricas.getRetangulo().setAltura(10);
        figurasGeometricas.getRetangulo().setBase(5);
        figurasGeometricas.getCirculo().setRaio(25);
        figurasGeometricas.getQuadrado().setLado(7);

        System.out.println("Perímetro do retângulo: " + figurasGeometricas.getRetangulo().calcularPerimetro());
        System.out.printf("Perímetro do círculo: %.2f %n", figurasGeometricas.getCirculo().calcularPerimetro());
        System.out.println("Perímeto do quadrado: " + figurasGeometricas.getQuadrado().calcularPerimetro());

        System.out.println("Área do quadrado: " + figurasGeometricas.getQuadrado().calcularArea());
        System.out.println("Área do retângulo: " + figurasGeometricas.getRetangulo().calcularArea());
        System.out.printf("Área do círculo: %.2f %n", figurasGeometricas.getCirculo().calcularArea());

        System.out.println(figurasGeometricas.getAtributosTodasFiguras());

    }
}