public class MultiplosDeCinco {

    public static void main(String[] args) {
        System.out.println("--- Múltiplos de 5 (del 0 al 100) ---");

        // El bucle 'for' se encargará de revisar cada número desde 0 hasta 100
        for (int i = 0; i <= 100; i++) {
            // Usamos el operador módulo (%) para saber si 'i' es un múltiplo de 5.
            // Si el residuo de dividir 'i' entre 5 es 0, entonces es un múltiplo.
            if (i % 5 == 0) {
                // Si es un múltiplo, se imprime por  consola
                System.out.println(i);
            }
        }

        System.out.println("------------------------------------");
    }
}