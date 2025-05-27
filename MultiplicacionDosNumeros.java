import java.util.Scanner;

public class MultiplicacionDosNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir el primer número
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        // Pedir el segundo número
        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        // Multiplicar los dos números
        int resultado = numero1 * numero2;

        // Mostrar el resultado
        System.out.println("El resultado de la multiplicación es: " + resultado);

        // Cerrar el Scanner
        scanner.close();
    }
}
