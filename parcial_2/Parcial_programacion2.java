/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package nn.parcial_programacion2;

/**
 *
 * @author User
 */
public class Parcial_programacion2 {

    // Clase Planeta
    public static class Planeta {
        // Atributos
        String nombre;
        int cantidadSatelites;
        double masa; // en kg
        double volumen; // en m^3
        double diametro; // en km
        double distanciaAlSol; // en km
        boolean esObservable;

        // Constructor
        public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, double diametro, double distanciaAlSol, boolean esObservable) {
            this.nombre = nombre;
            this.cantidadSatelites = cantidadSatelites;
            this.masa = masa;
            this.volumen = volumen;
            this.diametro = diametro;
            this.distanciaAlSol = distanciaAlSol;
            this.esObservable = esObservable;
        }

        // Métodos para imprimir los valores de los atributos
        public void imprimirAtributos() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Cantidad de Satélites: " + cantidadSatelites);
            System.out.println("Masa: " + masa + " kg");
            System.out.println("Volumen: " + volumen + " m^3");
            System.out.println("Diámetro: " + diametro + " km");
            System.out.println("Distancia al Sol: " + distanciaAlSol + " km");
            System.out.println("Es observable: " + esObservable);
        }

        // Método para calcular la densidad
        public double calcularDensidad() {
            return masa / volumen; // Densidad en kg/m^3
        }
    }

    // Método main, el punto de entrada del programa
    public static void main(String[] args) {
        // Crear objetos Planeta con los nuevos parámetros
        Planeta planeta1 = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        Planeta planeta2 = new Planeta("Júpiter", 1, 1.899E27, 1.4313E15, 139820, 750000000, true);

        // Imprimir atributos de los planetas
        System.out.println("Planeta 1:");
        planeta1.imprimirAtributos();
        System.out.println("Densidad: " + planeta1.calcularDensidad() + " kg/m^3\n");

        System.out.println("Planeta 2:");
        planeta2.imprimirAtributos();
        System.out.println("Densidad: " + planeta2.calcularDensidad() + " kg/m^3");
    }
}
