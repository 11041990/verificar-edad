
package brindarinformacion;

import java.util.Scanner;

public class BRINDARINFORMACION {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingresa el nombre de un artista, película o serie de tu preferencia: ");
        String eleccion = scanner.nextLine();
        switch (eleccion.toLowerCase()) {
            case "cardenales":
                System.out.println("cardenales es un grupo norteño .");
                break;
                 case "interstellar":
               System.out.println("sangre por sangre pelicula mexicana .");
                break;
                case "lafamilia peluche":
                System.out.println("lafamilia peluche es una serie de comedia.");
                break;
                 case "carin leon":
                 System.out.println("carin leon es un cantante muy famoso mexicano.");
                 break;
                 case "pelicula de corrido de los perez":
                     System.out.println("pelicua de corrido de los perez es antigua .");
                     break;
                     default:
                      System.out.println("No tengo información sobre esa elección."); 
                      
                      
        }
    }
    
}
