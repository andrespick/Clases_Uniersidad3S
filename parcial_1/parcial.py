linea = "------------------------------------------------"
print(linea)
print("Programa para saber si un numero es multipo del otro y viceversa")
print(linea)
print("Escribe el primer numero")
numero1 = int(input())
print(linea)
print("Escribe el segundo numero")
numero2 = int(input())



if numero1 == 0 or numero2 == 0:
    print(linea)
    print("No se puede dividir entre cero.")
else:
    if numero1 % numero2 == 0:
        print(linea)
        print( f"el numero  {numero1} es multiplo de {numero2}")
    elif numero2 % numero1 == 0:
        print(linea)
        print( f"el numero  {numero2} es multiplo de {numero1}")
    else:
        print(linea)
        print(f"El número {numero1} y {numero2} no son múltiplos entre sí")