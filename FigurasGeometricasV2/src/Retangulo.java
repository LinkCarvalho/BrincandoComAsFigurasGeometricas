public class Retangulo extends CalculosGeometricos {

    private double altura;
    private double base;

    public Retangulo(double base, double altura) {
        if(altura <=0 || base <= 0){
            throw new IllegalArgumentException("Entrada inválida, todas as medidas devem ser maiores que zero!");
        }
        this.base = base;
        this.altura = altura;
    }

    public Retangulo() {
    }


    public void setAltura(double altura) {
        if (altura <= 0){
            throw new IllegalArgumentException("Entrada inválida. Medida deve ser maior que zero!");
        }else{
            this.altura = altura;
        }
    }


    public void setBase(double base) {
        if (base <= 0){
            throw new IllegalArgumentException("Entrada inválida. Medida deve ser maior que zero!");
        }else{
            this.base = base;
        }
    }

    @Override
    public double calcularArea() {
        return altura * base;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (altura + base);
    }

    @Override
    public String toString() {
        return "O retângulo criado tem altura de tamanho: " + altura + " e largura de tamanho: " + base;
    }
}
