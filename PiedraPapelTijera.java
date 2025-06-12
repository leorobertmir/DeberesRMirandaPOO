import java.util.Scanner; // Still need this to read input

public class PiedraPapelTijera {


    private static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("--- ¡Piedra, Papel o Tijera! ---");
        System.out.println("------------------------------------------");

        // Obtenemos la jugada del Jugador 1 usando nuestra nueva función
        String jugadaJugador1 = obtenerJugadaValida("1");

        // Obtenemos la jugada del Jugador 2 usando nuestra nueva función
        String jugadaJugador2 = obtenerJugadaValida("2");

        // Cerramos el Scanner una vez que ya no lo necesitamos
        lector.close();

        System.out.println("\n--- ¡Resultados! ---");

        // --- Determinar el Ganador ---
        if (jugadaJugador1.equals(jugadaJugador2)) {
            System.out.println("¡Empate!");
        } else if (
            // Condiciones de victoria para el Jugador 1
            (jugadaJugador1.equals("piedra") && jugadaJugador2.equals("tijera")) ||
            (jugadaJugador1.equals("papel") && jugadaJugador2.equals("piedra")) ||
            (jugadaJugador1.equals("tijera") && jugadaJugador2.equals("papel"))
        ) {
            System.out.println("¡Gana el jugador 1!");
        } else {
            // Si no hay empate y el Jugador 1 no ganó, entonces el Jugador 2 gana
            System.out.println("¡Gana el jugador 2!");
        }

        System.out.println("------------------------------------------");
    }

    
    public static String obtenerJugadaValida(String numeroJugador) {
        String jugada;
        while (true) {
            System.out.print("Turno del jugador " + numeroJugador + " (introduzca piedra, papel o tijera): ");
            jugada = lector.nextLine().trim().toLowerCase(); // Leer, quitar espacios y convertir a minúsculas

            // Validar la jugada
            if (jugada.equals("piedra") || jugada.equals("papel") || jugada.equals("tijera")) {
                break; // Si es válida, salimos del bucle
            } else {
                System.out.println("¡Error! Opción incorrecta para el jugador " + numeroJugador + ". Por favor, introduzca 'piedra', 'papel' o 'tijera'.");
            }
        }
        return jugada; // Devolvemos la jugada válida
    }
}