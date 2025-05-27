import java.util.Scanner; // clase para leer la entrada del usuario

public class AreaRectangulo {

    public static void main(String[] args) {
        // Crear un objeto Scanner para obtener la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Declarar variables para almacenar la base y la altura del rectángulo
        double base;
        double altura;
        double area; // Variable para almacenar el resultado del área

        // Pedir al usuario que ingrese la longitud de la base
        System.out.print("Ingrese la longitud de la base del rectángulo: ");
        // Leer el valor de la base ingresado por el usuario
        base = entrada.nextDouble();

        // Pedir al usuario que ingrese la longitud de la altura
        System.out.print("Ingrese la longitud de la altura del rectángulo: ");
        // Leer el valor de la altura ingresado por el usuario
        altura = entrada.nextDouble();

        // Calcular el área del rectángulo (Fórmula: Área = Base * Altura)
        area = base * altura;

        // Mostrar el resultado del cálculo
        System.out.println("El área del rectángulo con base " + base + " y altura " + altura + " es: " + area);

        // Cerrar el objeto Scanner para liberar recursos
        entrada.close();
    }
}