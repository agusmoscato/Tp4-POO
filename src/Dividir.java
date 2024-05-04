import java.util.Scanner;

public class Dividir {
    // public static int dividir(int a, int b) {
    //     return a / b;
    // }
    public static int dividir(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.err.println("Error: No es posible dividir por cero.");
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el Dividendo:");
        int dividendo = scanner.nextInt();
        int divisor = 0;
        do  {
            System.out.println("Ingrese el Divisor:");
            divisor = scanner.nextInt();
        } while (divisor > dividendo);
        System.out.println("El resultado de " + dividendo + " / " + divisor + " es: ");
        System.out.println(dividir(dividendo, divisor));
        scanner.close();
    }
}









/*
 *
 * Al realizar pruebas con diferentes valores distintos de 0 anda perfectamente, el problema está cuando el divisor es 0.
 * Al ser cero, ocurre un problema y te salta la excepcion "ArithmeticException"
 * 
 * En la forma que tuvimos de capturar esta execepcion le colocamos el valor por defecto que en ese caso seria cero, y
 * devolvemos el mensaje "Error: No es posible dividir por cero."
 * 
 */