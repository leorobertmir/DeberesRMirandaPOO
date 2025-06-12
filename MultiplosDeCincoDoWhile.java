public class MultiplosDeCincoDoWhile {

    public static void main(String[] args) {
        System.out.println("--- Múltiplos de 5 (del 0 al 100) ---");

        // Inicializamos la variable 'numero' en 0
        int numero = 0;

        // El bucle 'do-while' asegura que el código dentro del 'do' se ejecute al menos una vez,
        // y luego continuará mientras la condición del 'while' sea verdadera.
        do {
            // Verificamos si el número actual es un múltiplo de 5.
            // Para ello, comprobamos si el residuo de dividir 'numero' entre 5 es 0.
            if (numero % 5 == 0) {
                // Si es un múltiplo de 5, lo imprimimos en la consola
                System.out.println(numero);
            }

            // Incrementamos 'numero' en 1 en cada iteración.
            // Esto es crucial para que el bucle avance y no sea infinito.
            numero++;

        } while (numero <= 100); // La condición se evalúa al final de cada iteración

        System.out.println("------------------------------------");
    }
}