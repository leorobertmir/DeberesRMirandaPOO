import java.util.Scanner; 

public class TablaMultiplicar {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del teclado
        Scanner lector = new Scanner(System.in);
        int numero; // Variable para guardar el número que el usuario va a introducir

        System.out.println("--- Generador de Tablas de Multiplicar ---");

        // Paso 1: Pedir al usuario que introduzca un número
        System.out.print("Por favor, introduce un número entero para ver su tabla de multiplicar: ");
        
        // Paso 2: Leer el número que el usuario ha introducido
        // Usamos un bucle while para asegurarnos de que el usuario introduzca un número válido
        while (!lector.hasNextInt()) {
            System.out.println("Entrada no válida. Por favor, introduce un número entero.");
            lector.next(); // Descarta la entrada incorrecta
            System.out.print("Por favor, introduce un número entero para ver su tabla de multiplicar: ");
        }
        numero = lector.nextInt(); // Lee el número entero válido
        
        
        lector.nextLine(); 

        System.out.println("\n--- Tabla de Multiplicar del " + numero + " ---");

        // Paso 3: Usar un bucle para calcular y mostrar la tabla de multiplicar
        // El bucle 'for' irá desde 1 hasta 10 (incluido)
        for (int i = 1; i <= 10; i++) {
            // Calculamos el resultado de la multiplicación
            int resultado = numero * i;
            // Mostramos la operación y el resultado
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Paso 4: Cerrar el Scanner 
        lector.close();

        System.out.println("------------------------------------------");
    }
}