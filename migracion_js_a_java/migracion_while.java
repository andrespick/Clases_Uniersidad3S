import java.util.Scanner;

public class migracion_while {

    public static class SumaNumerosNaturales {
        private int numerosNaturalesASumar;
        private int sumaNumerosNaturales;
        
        public SumaNumerosNaturales(int numerosNaturalesASumar) {
            this.numerosNaturalesASumar = numerosNaturalesASumar;
            this.sumaNumerosNaturales = 0;
        }
        public void calcularSuma() {
            int control = 1; 

            while (numerosNaturalesASumar >= control) {
                sumaNumerosNaturales += control; 
                control++; 
            }
        }
        public void mostrarResultado() {
            System.out.println("La suma de los " + numerosNaturalesASumar +
                    " primeros números naturales es igual a " + sumaNumerosNaturales);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de los primeros números naturales que desea sumar: ");
        int numeros = scanner.nextInt();

        SumaNumerosNaturales suma = new SumaNumerosNaturales(numeros);
        suma.calcularSuma();
        suma.mostrarResultado();
        scanner.close(); 
    }
}
