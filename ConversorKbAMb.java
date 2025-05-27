import java.util.Scanner;

public class ConversorKbAMb {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de KB
        System.out.print("Ingrese la cantidad en kilobytes (KB): ");
        double kilobytes = scanner.nextDouble();

        // Realizar la conversión a megabytes
        double megabytes = kilobytes / 1024;

        // Mostrar el resultado
        System.out.println(kilobytes + " KB equivalen a " + megabytes + " MB");

        // Cerrar el Scanner
        scanner.close();
    }
}
