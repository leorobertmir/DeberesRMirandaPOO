import java.util.Scanner;

/**
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * 
 * 7, 6 , 5, 4 , 3, 2, 1
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingresa un número");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int auxiliar = 0;
        while (auxiliar < 5) {
            if (numero <= 0) {
                break;
            }
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            System.out.println("El cuadrado de " + numero + " es =   " + cuadrado);
            System.out.println("El cubo de " + numero + " es =   " + cubo);
            numero--;
            auxiliar++;
        }
    }
}