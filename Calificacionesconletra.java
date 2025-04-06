
package calificacionesconletra;

import java.util.Scanner;

public class Calificacionesconletra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu calificación numérica (0-100): ");
         int calificacion = scanner.nextInt();
         
          if (calificacion >= 90 && calificacion <= 100) {
              System.out.println("Tu calificación es: A");
              } else if (calificacion >= 80) {
                  System.out.println("Tu calificación es: B");
                  } else if (calificacion >= 70) {
                 System.out.println("Tu calificación es: C");
                 } else if (calificacion >= 60) {
                 System.out.println("Tu calificación es: D");
                 } else {
                 System.out.println("Tu calificación es: F");
                 
          }
    }
    
}
