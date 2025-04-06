
package verificaredad;

import java.util.Scanner;

public class VERIFICAREDAD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        
         if (edad >= 18) {
             System.out.println("Eres elegible para votar.");
             } else {
             System.out.println("No eres elegible para votar.");
             
         }
    }
    
}
