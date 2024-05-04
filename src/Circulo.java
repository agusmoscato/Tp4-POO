import java.util.Scanner;

public class Circulo {
    public static final double PI = 3.14;
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return PI * radio * radio;
    }

    public double calcularLongitud() {
        return 2 * PI * radio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circulo circulo = new Circulo();

        System.out.println("Ingrese el radio del círculo:");
        double radio = scanner.nextDouble();
        circulo.setRadio(radio);

        System.out.println("El área del círculo es: " + circulo.calcularArea());
        System.out.println("La longitud del círculo es: " + circulo.calcularLongitud());

        scanner.close();
    }
}



/*
 * 
 * No se puede crear un método en la clase Circulo para establecer el valor de PI como tal, 
 * porque PI es una constante y, por definición, su valor no debe cambiar una vez que se ha inicializado. 
 * Sin embargo, se puede crear un método que devuelva el valor de PI sin modificarlo.
 * No es posible ya que esta variable es de tipo "final" y por definición, debe tener un valor que no cambie durante la ejecución
 * del programa.
 * 
 */