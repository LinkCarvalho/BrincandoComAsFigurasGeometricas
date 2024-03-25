public class Quadrado extends CalculosGeometricos {
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public Quadrado(){

    }

    public void setLado(double lado) {
        if (lado <= 0){
            throw new IllegalArgumentException("Entrada inválida. Medida deve ser maior que zero!");
        }else{
            this.lado = lado;
        }
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return this.lado * 4;
    }

    @Override
    public String toString() {
        return "O quadrado criado tem lados de tamanho: " + lado;
    }
}
