
package convertirgrados;

import java.util.Scanner;

public class CONVERTIRGRADOS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          System.out.println("Ingresa la temperatura en grados Celsius: ");
          double celsius = scanner.nextDouble();
          
          System.out.println("Elige la opción para convertir: ");
          System.out.println("1. Convertir a Fahrenheit");
          System.out.println("2. Convertir a Kelvin");
           int opcion = scanner.nextInt();
           
           switch (opcion) {
               case 1:
             double fahrenheit = (celsius * 9/5) + 32;
             System.out.printf("La temperatura en Fahrenheit es: %.2f°F\n", fahrenheit);
             break;
             case 2:
                 double kelvin = celsius + 273.15;
                 System.out.printf("La temperatura en Kelvin es: %.2fK\n", kelvin);
                 break;
                 default:
                     System.out.println("Opción no válida");
                     
           }
    }
    
}
