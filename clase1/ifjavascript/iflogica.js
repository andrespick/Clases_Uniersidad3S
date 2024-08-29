var salarioSinAjueste, porcentajeAumento, salarioConAjueste ;
porcentajeAumento = parseFloat(prompt("ingrese el porcentaje a aumentar el salario "));
salarioSinAjueste=parseFloat(prompt("ingrese su salario actual: "));
if (salarioSinAjueste<1300606) {
    salarioConAjueste = salarioSinAjueste+(salarioSinAjueste*porcentajeAumento);
} else {
    salarioConAjueste= salarioSinAjueste;
}
alert("su salario con ajuste es: "+salarioConAjueste);