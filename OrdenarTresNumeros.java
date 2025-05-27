import java.util.Scanner;

public class OrdenarTresNumeros {
    public static void main(String[] args) {
        // Crear Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir tres números enteros
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        // Variables auxiliares para ordenamiento
        int temp;

        // Ordenar los números usando comparaciones básicas
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // Mostrar los números ordenados
        System.out.println("Números ordenados de menor a mayor: " + num1 + ", " + num2 + ", " + num3);

        // Cerrar el Scanner
        scanner.close();
    }
}
