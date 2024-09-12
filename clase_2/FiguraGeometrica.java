public class FiguraGeometrica{
    float ladoCuadrado;
    float baseTriangulo;
    float alturaTriangulo;
    float radioCiculo;
    int opcionFiguraGeometrica;
    public FiguraGeometrica(float ladoCuadrado, float baseTriangulo, float alturaTriangulo, float radioCiculo,
            int opcionFiguraGeometrica) {
        this.ladoCuadrado = ladoCuadrado;
        this.baseTriangulo = baseTriangulo;
        this.alturaTriangulo = alturaTriangulo;
        this.radioCiculo = radioCiculo;
        this.opcionFiguraGeometrica = opcionFiguraGeometrica;
       
    }
    public void calcularArea(){
        switch (opcionFiguraGeometrica) {
            case 1:
                float areaCuadrado = ladoCuadrado*ladoCuadrado;
                System.out.println("el area del cuadrado es: "+ areaCuadrado);
                break;
            case 2:
                float areaTringulo = (alturaTriangulo*baseTriangulo)/2;
                System.out.println("el aera del triengulo es: "+ areaTringulo);
                break;        
            case 3:
                double areaCirculo = (Math.PI) * Math.pow(radioCiculo, radioCiculo);
                System.out.println("el area delcirculo es: " + areaCirculo);
                break;
            default:
                break;
        }
    }
    

}
    
