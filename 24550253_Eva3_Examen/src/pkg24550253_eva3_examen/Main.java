/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg24550253_eva3_examen;

import java.util.Scanner;

/**
 *
 * @author lamam
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner captu = new Scanner(System.in);
         
         int numEstudiantes;

        do {
            System.out.print("INGRESE EL NUMERO DE ESTUDIANTES: ");
            numEstudiantes = captu.nextInt();

            if (numEstudiantes <= 0) {
                System.out.println("EL NUMERO DE ESTUDIANTES DEBE SER MAYOR A 0.");
            }
        } while (numEstudiantes <= 0);

       
        double[] califas = new double[numEstudiantes];

        int i = 0;
        while (i < numEstudiantes) { 
            System.out.print("CALIFICACIÓN DEL ESTUDIANTE " + (i + 1) + ": ");
            double califa = captu.nextDouble();

        if (califa < 0 || califa > 100) {
            System.out.println("La calificación debe estar entre 0 y 100. Intente de nuevo.");
        } else {
            califas[i] = califa; 
            i++; 
    }
}

        double prom = calcularProm(califas);

        
        int cantidadMayoresAlPromedio = contarCalificacionesMa(califas, prom);

        
        double calificacionMasAlta = CalificacionMasAlta(califas);
        double calificacionMasBaja = CalificacionMasBaja(califas);

        System.out.println("-----RESULTADOS-----");
        System.out.println("PROMEDIO DE CALIFICACIONES: " + prom);
        System.out.println("ESTUDIANTES CON CALIFICACIÓN MAYOR O IGUAL AL PROMEDIO: " + cantidadMayoresAlPromedio);
        System.out.println("CALIFICACIÓN MÁS ALTA: " + calificacionMasAlta);
        System.out.println("CALIFICACIÓN MÁS BAJA: " + calificacionMasBaja);

        
    }
   
    public static double calcularProm(double[] califas) {
        double suma = 0;
        for (double calificacion : califas) {
             suma += calificacion;
        }
        return suma/califas.length;
    }

   
    public static int contarCalificacionesMa(double[] califas, double prom) {
        int conta = 0;
        for (double calificacion : califas) {
            if (calificacion >= prom) {
                conta++;
            }
        }
        return conta;
    }

    
    public static double CalificacionMasAlta(double[] califas) {
        double masA = califas[0];
        for (double califa : califas) {
            if (califa > masA) {
                masA = califa;
            }
        }
        return masA;
    }

    
    public static double CalificacionMasBaja(double[] califas) {
        double masB = califas[0];
        for (double califa : califas) {
            if (califa < masB) {
                masB = califa;
            }
        }
        return masB;
    }
}
