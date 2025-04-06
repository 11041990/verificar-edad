
package conversordemonedas;

import java.util.Scanner;

public class Conversordemonedas {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingresa la cantidad en pesos mexicanos: ");
       double pesos = scanner.nextDouble();
       
       System.out.println("Elige la moneda para convertir: ");
       System.out.println("1. Dólar (USD)");
       System.out.println("2. Euro (EUR)");
       System.out.println("3. Bath (THB)");
       System.out.println("4. Yen (JPY)");
       System.out.println("5. Won (KRW)");
       System.out.println("6. Dólar Australiano (AUD)");
       System.out.println("7. Sol (PEN)");
       System.out.println("8. Dólar Canadiense (CAD)");
       System.out.println("9. Bolívar (VES)");
       System.out.println("10. Peso Argentino (ARS)");
       int opcion = scanner.nextInt();
       
       double tasaConversion;
       switch (opcion) {
           case 1: tasaConversion = 0.055; break;
           case 2: tasaConversion = 0.048; break;
           case 3: tasaConversion = 1.93; break;
           case 4: tasaConversion = 7.47; break;
           case 5: tasaConversion = 74.78; break;
           case 6: tasaConversion = 0.085; break;
           case 7: tasaConversion = 0.20; break;
           case 8: tasaConversion = 0.073; break;
           case 9: tasaConversion = 0.18; break;
           case 10: tasaConversion = 19.40; break;
           default:
               
               System.out.println("Opción no válida");
               return;
               }
       double resultado = pesos * tasaConversion;
       System.out.printf("La cantidad convertida es: %.2f\n", resultado);
       
           
       }
    }
    

