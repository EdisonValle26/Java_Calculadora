import java.util.Scanner;

public class calculadora {

    // Método para sumar
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    // Método para restar
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    // Método para multiplicar
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Método para dividir
    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la Calculadora");
        System.out.println("Seleccione una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        // Aquí agregarás el resto de las operaciones

        int opcion = scanner.nextInt();

        // Capturamos los números
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Solo la operación de suma está implementada
        double resultado = 0;
        if (opcion == 1) {
            resultado = sumar(num1, num2);
            System.out.println("El resultado es: " + resultado);
        }
        if (opcion == 2) {
            resultado = restar(num1, num2);
            System.out.println("El resultado es: " + resultado);
        }
        if (opcion == 3) {
            resultado = multiplicar(num1, num2);
            System.out.println("El resultado es: " + resultado);
        }
        if (opcion == 4) {
            resultado = dividir(num1, num2);
            System.out.println("El resultado es: " + resultado);
        }
        else {
            System.out.println("Operación no válida o no implementada aún.");
        }

        scanner.close();
    }
}