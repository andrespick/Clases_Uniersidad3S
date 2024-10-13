import java.util.Scanner;

public class migracion_for {

    public class Personas {
        private int edad;
        private int estadoCivil;
        private int estatura;
        private int sexo;

        public Personas(int edad, int estadoCivil, int estatura, int sexo) {
            this.edad = edad;
            this.estadoCivil = estadoCivil;
            this.estatura = estatura;
            this.sexo = sexo;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorPersonas = 0, acumuladorEdad = 0, acumuladorEstatura = 0;
        double promedioEdad, promedioEstatura, porcentajeCondicion;
        int cantidadPersonas = 2;

        for (int i = 1; i <= cantidadPersonas; i++) {
            System.out.println("Ingrese la edad de la persona número " + i + ": ");
            int edad = scanner.nextInt();

            System.out.println("Ingrese el estado civil (1. Soltero  2. Casado): ");
            int estadoCivil = scanner.nextInt();

            System.out.println("Ingrese la estatura en cm (ejemplo 180): ");
            int estatura = scanner.nextInt();

            System.out.println("Ingrese el sexo (1. Hombre  2. Mujer): ");
            int sexo = scanner.nextInt();

            if (edad >= 18 && estadoCivil == 1 && estatura > 170 && sexo == 1) {
                contadorPersonas++;
                acumuladorEdad += edad;
                acumuladorEstatura += estatura;
            }
        }

        if (contadorPersonas > 0) {
            promedioEdad = (double) acumuladorEdad / contadorPersonas;
            promedioEstatura = (double) acumuladorEstatura / contadorPersonas;
            porcentajeCondicion = ((double) contadorPersonas / cantidadPersonas) * 100;

            System.out.println("Promedio de edades: " + promedioEdad);
            System.out.println("Promedio de estaturas: " + promedioEstatura);
            System.out.println("Porcentaje de personas que cumplen condiciones: " + porcentajeCondicion + "%");
        } else {
            System.out.println("Ninguna persona cumple con las condiciones.");
        }

        scanner.close();
    }

}