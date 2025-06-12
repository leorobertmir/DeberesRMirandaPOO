import java.util.Scanner; // Necesitamos esta herramienta para leer lo que el usuario escribe

public class AnalizadorDeNumeros {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del teclado
        Scanner lector = new Scanner(System.in);

        // --- Variables para almacenar los datos y resultados ---
        int contadorNumeros = 0; // Para contar cuántos números válidos se introdujeron
        int sumaImpares = 0;     // Para sumar los números impares
        int contadorImpares = 0; // Para contar cuántos números impares se introdujeron
        int mayorPar = Integer.MIN_VALUE; // Para guardar el mayor número par.
                                          // Se inicializa con el valor entero más pequeño posible
                                          // para asegurar que cualquier número par válido sea mayor.
        boolean seEncontroPar = false; // Bandera para saber si al menos un número par fue introducido

        System.out.println("--- Analizador de Números ---");
        System.out.println("Introduce números enteros. El programa terminará cuando introduzcas un número negativo.");
        System.out.println("----------------------------------------");

        int numero; // Variable para guardar el número que el usuario introduce en cada iteración

        // Usamos un bucle do-while para asegurar que se pida al menos un número
        do {
            System.out.print("Introduce un número (o un negativo para terminar): ");

            // Validar que la entrada sea un número entero
            while (!lector.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                lector.next(); // Descarta la entrada incorrecta
                System.out.print("Introduce un número (o un negativo para terminar): ");
            }
            numero = lector.nextInt(); // Leer el número introducido

            // El número negativo solo es para terminar, no se incluye en el cómputo
            if (numero >= 0) {
                contadorNumeros++; // Incrementamos el contador de números introducidos

                // Comprobamos si el número es par o impar
                if (numero % 2 == 0) { // Es par
                    // Si el número actual es par y es mayor que el 'mayorPar' actual, o si es el primer par encontrado
                    if (!seEncontroPar || numero > mayorPar) {
                        mayorPar = numero;
                        seEncontroPar = true; // Marcamos que ya encontramos al menos un número par
                    }
                } else { // Es impar
                    sumaImpares += numero;     // Sumamos el número impar
                    contadorImpares++;         // Incrementamos el contador de impares
                }
            }

        } while (numero >= 0); // El bucle continúa mientras el número introducido no sea negativo

        // Cerramos el Scanner para liberar recursos
        lector.close();

        System.out.println("\n--- Resumen de Resultados ---");
        System.out.println("Números introducidos (válidos): " + contadorNumeros);

        // Calculamos y mostramos la media de los impares
        if (contadorImpares > 0) {
            double mediaImpares = (double) sumaImpares / contadorImpares; // Convertimos a double para obtener decimales
            System.out.printf("Media de los números impares: %.2f%n", mediaImpares); // Formateamos a 2 decimales
        } else {
            System.out.println("No se introdujeron números impares.");
        }

        // Mostramos el mayor de los pares
        if (seEncontroPar) {
            System.out.println("El mayor número par introducido: " + mayorPar);
        } else {
            System.out.println("No se introdujeron números pares.");
        }

        System.out.println("----------------------------------------");
    }
}