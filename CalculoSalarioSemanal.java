import java.util.Scanner;

public class CalculoSalarioSemanal {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de horas trabajadas
        System.out.print("Ingrese la cantidad de horas trabajadas en la semana: ");
        int horasTrabajadas = scanner.nextInt();

        // Definir el salario por hora
        final double tarifaPorHora = 12.0;

        // Calcular el salario semanal
        double salarioSemanal = horasTrabajadas * tarifaPorHora;

        // Mostrar el resultado
        System.out.println("El salario semanal es: " + salarioSemanal + " euros.");

        // Cerrar el Scanner
        scanner.close();
    }
}
