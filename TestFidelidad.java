import java.util.Scanner; // Necesitamos esta herramienta para leer lo que el usuario escribe

public class TestFidelidad {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del teclado
        Scanner lector = new Scanner(System.in);
        // Inicializamos la puntuación a 0
        int puntuacion = 0;
        // Definimos el valor de los puntos por respuesta "verdadero"
        final int PUNTOS_POR_VERDADERO = 3;

        System.out.println("--- Test de Fidelidad de Pareja ---");
        System.out.println("Contesta con 'si' o 'no' (o 'verdadero'/'falso') a cada pregunta.");
        System.out.println("------------------------------------");

        // Pregunta 1
        System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente: ");
        String respuesta1 = lector.nextLine().trim().toLowerCase(); // Lee la respuesta, quita espacios y la pone en minúsculas
        if (respuesta1.equals("si") || respuesta1.equals("verdadero")) {
            puntuacion += PUNTOS_POR_VERDADERO; // Suma puntos si la respuesta es "si" o "verdadero"
        }

        // Pregunta 2
        System.out.print("2. Ha aumentado sus gastos de vestuario: ");
        String respuesta2 = lector.nextLine().trim().toLowerCase();
        if (respuesta2.equals("si") || respuesta2.equals("verdadero")) {
            puntuacion += PUNTOS_POR_VERDADERO;
        }

        // Pregunta 3
        System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti: ");
        String respuesta3 = lector.nextLine().trim().toLowerCase();
        if (respuesta3.equals("si") || respuesta3.equals("verdadero")) {
            puntuacion += PUNTOS_POR_VERDADERO;
        }

        // Pregunta 4
        System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer): ");
        String respuesta4 = lector.nextLine().trim().toLowerCase();
        if (respuesta4.equals("si") || respuesta4.equals("verdadero")) {
            puntuacion += PUNTOS_POR_VERDADERO;
        }

        // Pregunta 5
        System.out.print("5. No te deja que mires la agenda de su teléfono móvil: ");
        String respuesta5 = lector.nextLine().trim().toLowerCase();
        if (respuesta5.equals("si") || respuesta5.equals("verdadero")) {
            puntuacion += PUNTOS_POR_VERDADERO;
        }

        // Pregunta 6
        System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante: ");
        String respuesta6 = lector.nextLine().trim().toLowerCase();
        if (respuesta6.equals("si") || respuesta6.equals("verdadero")) {
            puntuacion += PUNTOS_POR_VERDADERO;
        }

        // Pregunta 7
        System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a: ");
        String respuesta7 = lector.nextLine().trim().toLowerCase();
        if (respuesta7.equals("si") || respuesta7.equals("verdadero")) {
            puntuacion += PUNTOS_POR_VERDADERO;
        }

        // Pregunta 8
        System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo: ");
        String respuesta8 = lector.nextLine().trim().toLowerCase();
        if (respuesta8.equals("si") || respuesta8.equals("verdadero")) {
            puntuacion += PUNTOS_POR_VERDADERO;
        }

        // Pregunta 9
        System.out.print("9. Has notado que últimamente se perfuma más: ");
        String respuesta9 = lector.nextLine().trim().toLowerCase();
        if (respuesta9.equals("si") || respuesta9.equals("verdadero")) {
            puntuacion += PUNTOS_POR_VERDADERO;
        }

        // Pregunta 10
        System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo: ");
        String respuesta10 = lector.nextLine().trim().toLowerCase();
        if (respuesta10.equals("si") || respuesta10.equals("verdadero")) {
            puntuacion += PUNTOS_POR_VERDADERO;
        }

        // Cerramos el Scanner para liberar recursos
        lector.close();

        System.out.println("\n--- Resultados del Test ---");
        System.out.println("Tu puntuación total es: " + puntuacion + " puntos.");

                if (puntuacion <= 10) { 
            System.out.println(" Tu pareja parece ser totalmente fiel, triunfaste.");
        } else if (puntuacion <= 22) { // Si es mayor a 10 y hasta 22
            System.out.println("Puede que exista otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else { // Si es mayor a 22 (y, por el máximo de preguntas, hasta 30)
            System.out.println("Tu pareja está viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
        }
        

        System.out.println("------------------------------------");
    }
}