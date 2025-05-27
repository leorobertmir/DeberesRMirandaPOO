public class InformacionPersonal {

    public static void main(String[] args) {
        // 1. Crear variables y asignarles valores.
        // String es para texto, como nombres y direcciones.
        // Puedes usar String para el teléfono también, ya que no harás cálculos con él.
        String nombre = "Leonardo Roberto Miranda Ruiz";
        String direccion = "Sauces 7 Mz. D3 villa 10, Guayaquil";
        String telefono = "0986328152"; // Se usa String para mantener el formato original (ej. con guiones o prefijos)

        // 2. Mostrar los valores de las variables por pantalla.
        System.out.println("--- Información Personal ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("--------------------------");
    }
}