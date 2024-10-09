import java.util.Scanner;

public class PruebaFG {
    public static void main(String[] args) {
        Scanner fg = new Scanner(System.in);

        System.out.println("Elige la figura geométrica paara calcular el area: ");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triangulo");
        System.out.println("3. Circulo");
        int opcion = fg.nextInt();
        float ladoCuadrado = 0, baseTriangulo = 0, alturaTriangulo = 0, radioCirculo = 0;
        switch (opcion) {
            case 1:
                System.out.println("Ingresa el lado del cuadrado");
                ladoCuadrado = fg.nextFloat();
                break;
            case 2:
                System.out.println("Ingresa la base del triángulo");
                baseTriangulo = fg.nextFloat();
                System.out.println("Ingresa la altura del triángulo");
                alturaTriangulo = fg.nextFloat();
                break;
            case 3:
                System.out.println("Ingresa la el radio del circulo");
                radioCirculo = fg.nextFloat();
                break;
            default:
                System.out.println("Opción no valida");
                fg.close();
                return;
        }
        FiguraGeometrica figura = new FiguraGeometrica(ladoCuadrado, baseTriangulo, alturaTriangulo, radioCirculo,
                opcion);
        figura.calcularArea();
        fg.close();

    }
}