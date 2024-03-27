public class Circulo extends CalculosGeometricos {

    private double raio;

    public final double PI = 3.1415;

    public Circulo(double raio){
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio negativo ou menor que zero não existe.");
        }
        this.raio = raio;
    }

    public Circulo(){

    }

    public void setRaio(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio negativo ou menor que zero não existe.");
        }
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * this.raio * this.raio;

    }

    @Override
    public double calcularPerimetro() {
        return 2* PI * this.raio;
    }

    @Override
    public String toString() {
        return "O circulo criado tem raio de tamanho: " + raio;
    }
}
