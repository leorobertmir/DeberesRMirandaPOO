import java.util.Scanner;

public class ParODivisibleEntreCinco {
    public static void main(String[] args) {
        // Crear Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        // Verificar si es par
        boolean esPar = (numero % 2 == 0);

        // Verificar si es divisible entre 5
        boolean divisibleEntre5 = (numero % 5 == 0);

        // Mostrar resultados
        if (esPar && divisibleEntre5) {
            System.out.println("El número es par y divisible entre 5.");
        } else if (esPar) {
            System.out.println("El número es par pero no divisible entre 5.");
        } else if (divisibleEntre5) {
            System.out.println("El número no es par pero es divisible entre 5.");
        } else {
            System.out.println("El número no es par ni divisible entre 5.");
        }

        // Cerrar Scanner
        scanner.close();
    }
}
