import javax.swing.*;
public class MainOP{
    public static void main(String[] args){
        String salarioSinAjusteMje = JOptionPane.showInputDialog(null,"ingrese el salario sin ajuste");
        String porcentajeAumentoMje = JOptionPane.showInputDialog(null,"ingrese el porcentaje del aumento");
        int salarioSinAjuste = Integer.parseInt(salarioSinAjusteMje);
        float porcentajeAumento = Float.parseFloat(porcentajeAumentoMje);
        ejercicio pruebaJOP = new ejercicio(salarioSinAjuste, porcentajeAumento );
        float salarioAjustado = pruebaJOP.calcularSalario();
        JOptionPane.showMessageDialog(null, "salario con ajuste es: "+salarioAjustado);
    }
    
}