/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos03;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
//generar una solucion que perimta sumar dos numero los numeros deben ser ingrasados 
//por teclado por el metodo mein el metodo debe verificar que los dos numeros 
//sean positivos para realizar la operacion caso contrario debe devolver 0
public class Ejemplo031 {

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        int valor1;
        int valor2;
        // obtenerSuma
        System.out.printf("Ingrese el valor primario");
        valor1 = entrada.nextInt();
        System.out.printf("Ingrese el valor secundario");
        valor2 = entrada.nextInt();
        int valor = obtenerSuma(valor1, valor2); // se invoca al método 

        System.out.printf("El valor de la suma es: %d\n", obtenerSuma(valor1, valor2));
    }

    public static int obtenerSuma(int a, int b) {
        int suma;
        if (a > 0 && b > 0) {
            suma = a + b;
        } else {
            suma = 0;
        }
         return suma; 
    }
}
