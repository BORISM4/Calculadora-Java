import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    private Operacion operacion;

    public Calculadora() {
        this.operacion = new Operacion();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione la operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("0. Salir");
            System.out.println("Por favor, ingrese solo el número de la opción:");

            try {
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el primer número:");
                        double num1 = scanner.nextDouble();
                        System.out.println("Ingrese el segundo número:");
                        double num2 = scanner.nextDouble();
                        System.out.println("Resultado: " + operacion.suma(num1, num2));
                        break;
                    case 2:
                        System.out.println("Ingrese el primer número:");
                        num1 = scanner.nextDouble();
                        System.out.println("Ingrese el segundo número:");
                        num2 = scanner.nextDouble();
                        System.out.println("Resultado: " + operacion.resta(num1, num2));
                        break;
                    case 3:
                        System.out.println("Ingrese el primer número:");
                        num1 = scanner.nextDouble();
                        System.out.println("Ingrese el segundo número:");
                        num2 = scanner.nextDouble();
                        System.out.println("Resultado: " + operacion.multiplicacion(num1, num2));
                        break;
                    case 4:
                        System.out.println("Ingrese el primer número:");
                        num1 = scanner.nextDouble();
                        System.out.println("Ingrese el segundo número:");
                        num2 = scanner.nextDouble();
                        System.out.println("Resultado: " + operacion.division(num1, num2));
                        break;
                    case 5:
                        System.out.println("Ingrese la base:");
                        double base = scanner.nextDouble();
                        System.out.println("Ingrese el exponente:");
                        double exponente = scanner.nextDouble();
                        System.out.println("Resultado: " + operacion.potencia(base, exponente));
                        break;
                    case 6:
                        System.out.println("Ingrese el número:");
                        num1 = scanner.nextDouble();
                        System.out.println("Resultado: " + operacion.raizCuadrada(num1));
                        break;
                    case 0:
                        continuar = false;
                        System.out.println("Saliendo de la calculadora.");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número no letra.");
                scanner.next();
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.iniciar();
    }
}
