/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author darkpsy
 */
public class CalcularLaSumaDe3Notas {
    static double resultado;
    private static double sumaNotas(double a, double b, double c){
        resultado = a + b + c;
        System.out.println("");
        System.out.println(resultado);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calificación 1: ");
        double uno = sc.nextDouble();
        
        System.out.println("Calificación 2: ");
        double dos = sc.nextDouble();
        
        System.out.println("Calificación 3: ");
        double tres = sc.nextDouble();
        
        sumaNotas(uno, dos, tres);
        
    }
    
}
