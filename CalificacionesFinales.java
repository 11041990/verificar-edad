
package calificaciones.finales;

import java.util.Scanner;

public class CalificacionesFinales {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedir al usuario que ingrese las tres calificaciones
        System.out.println("Ingresa la calificación de los parciales (0-100): ");
        double parciales = scanner.nextDouble();
        System.out.println("Ingresa la calificación del proyecto (0-100): ");
        double proyecto = scanner.nextDouble();
        System.out.println("Ingresa la calificación del examen final (0-100): ");
        double examenFinal = scanner.nextDouble();
        
        // Validar que las calificaciones estén en el rango de 0 a 100
         if (parciales < 0 || parciales > 100 || proyecto < 0 || proyecto > 100 || examenFinal < 0 || examenFinal > 100) {
             System.out.println("Las calificaciones deben estar en el rango de 0 a 100.");
             } else {
             // Calcular la calificación final
             double calificacionFinal = (parciales * 0.4) + (proyecto * 0.3) + (examenFinal * 0.3);
             System.out.printf("La calificación final es: %.2f\n", calificacionFinal);
             
             
         }
    }
    
}
