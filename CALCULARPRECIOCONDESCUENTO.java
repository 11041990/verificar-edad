
package calcularpreciocondescuento;

import java.util.Scanner;

public class CALCULARPRECIOCONDESCUENTO {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingresa el precio original del producto: ");
       double precio = scanner.nextDouble();
       double precioFinal;
       
        if (precio <= 100) {
         precioFinal = precio;
          } else if (precio <= 200) {
          precioFinal = precio * 0.9;
          } else if (precio <= 500) {
           precioFinal = precio * 0.8;
           } else {
            precioFinal = precio * 0.75;
            }
         System.out.printf("El precio final después del descuento es: %.2f\n", precioFinal);
         
        }
    }
    
}
