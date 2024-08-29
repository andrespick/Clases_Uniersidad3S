public class ejercicio {
    float salarioSinAjuste;
    float porcentajeAumento;
    float salarioConAjuste;
    public ejercicio(float salarioSinAjuste, float porcentajeAumento) {
        this.salarioSinAjuste = salarioSinAjuste;
        this.porcentajeAumento = porcentajeAumento;
        this.salarioConAjuste = 0;
    }
    public float calcularSalario(){
        if (salarioSinAjuste<1300606) {
            salarioConAjuste=salarioSinAjuste+(salarioSinAjuste*porcentajeAumento);
        } else {
            salarioConAjuste=salarioSinAjuste;
        }
        return salarioConAjuste;
    }
    
}