public class Operacion {

    // Método para realizar la suma de dos números
    public double suma(double a, double b) {
        return a + b;
    }

    // Método para realizar la resta entre dos números
    public double resta(double a, double b) {
        return a - b;
    }

    // Método para realizar la multiplicación de dos números
    public double multiplicacion(double a, double b) {
        return a * b;
    }

    // Método para realizar la división entre dos números
    // Lanza una excepción si se intenta dividir por cero
    public double division(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        return a / b;
    }

    // Método para calcular la potencia de un número base elevado a un exponente
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    // Método para calcular la raíz cuadrada de un número
    // Lanza una excepción si se intenta calcular la raíz cuadrada de un número negativo
    public double raizCuadrada(double a) throws IllegalArgumentException {
        if (a < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(a);
    }
}
