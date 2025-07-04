public class MultiplosDeCincoWhile {

    public static void main(String[] args) {
        System.out.println("--- Múltiplos de 5 (del 0 al 100) ---");

        // Inicializamos la variable 'numero' en 0, que será nuestro contador
        int numero = 0;

        // El bucle 'while' continuará mientras 'numero' sea menor o igual a 100
        while (numero <= 100) {
            // Verificamos si el número actual es un múltiplo de 5.
            // Para ello, comprobamos si el residuo de dividir 'numero' entre 5 es 0.
            if (numero % 5 == 0) {
                // Si es un múltiplo de 5, lo imprimimos en la consola
                System.out.println(numero);
            }

            // Incrementamos 'numero' en 1 en cada iteración.
        
            numero++;
        }

        System.out.println("------------------------------------");
    }
}