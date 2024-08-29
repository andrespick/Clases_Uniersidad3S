import java.util.*;
public class MainScanner {
    public static void main(String[] args) {
        Scanner sal = new Scanner(System.in);
        System.out.println("ingrese el salario si ajuste: ");
        float salarioSinAjuste = sal.nextFloat();
        System.out.println("ingrese el porcentaje del aumento(si es el 15% ingrese 0.15 ) ");
        ejercicio purebaScanner = new ejercicio(salarioSinAjuste,salarioSinAjuste);
        float salarioAjustado = purebaScanner.calcularSalario();
        System.out.println("el salario ajustado es igual a: "+salarioAjustado);
        sal.close();


    }
    
    
}
