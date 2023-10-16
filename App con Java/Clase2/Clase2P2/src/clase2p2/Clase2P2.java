package clase2p2;

import java.util.Scanner;

public class Clase2P2 {

    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        String nombre;

        Scanner rd = new Scanner(System.in);

        System.out.print("\n Ingresa tu nombre: ");
        nombre = rd.nextLine();

        System.out.print("\n Ingresa el primer numero : ");
        num1 = rd.nextInt();

        System.out.print("\n Ingresa el segundo numero : ");
        num2 = rd.nextInt();

        System.out.print("\n Ingresa el tercer numero : ");
        num3 = rd.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El Primer numero es el mayor: "+num1);
        } else 
            
            
            if (num2 > num1 && num2 > num3) {
            System.out.println("El Segundo numero es el mayor: "+num2);
        } else 
            if (num3 > num1 && num3 > num2) {
            System.out.println("El Tercer numero es el mayor: "+num3);

        }
    }

}
