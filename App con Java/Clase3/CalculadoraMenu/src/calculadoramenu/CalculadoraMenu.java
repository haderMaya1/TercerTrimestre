// CALCULADORA CON MENÚ UTILIZANDO (DO - WHILE) - (IF) - (SWITCH - CASE)
// DO - WHILE --> REPITE UN PROCESO HASTA QUE SE ELIJA SALIR (VALIDAR)
// IF --> PARA TOMAR UNA DECISIÓN SOBRE UN VALOR
/* SWITCH - CASE --> TOMA UNA DECISIÓN A PARTIR DE UN VALOR DADO,
CON VARIOS RESULTADOS POSIBLES
 */
package calculadoramenu;

import java.util.Scanner;

public class CalculadoraMenu {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int op = 0;
        double n1 = 0;
        double n2 = 0;
        double resu = 0;

        do {
            System.out.print("\n Bienvenido, por favor: ");
            System.out.print("\n1. Sumar"
                    + "\n2. Restar"
                    + "\n3. Multiplicar"
                    + "\n4. Dividir"
                    + "\n5. Salir"
                    + "\n |---> ");

            op = tc.nextInt();

            if (op != 5) {
                System.out.print("Digite primer número ---> ");
                n1 = tc.nextDouble();
                System.out.print("Digite segundo numero --->");
                n2 = tc.nextDouble();
            }//FinIF

            switch (op) {
                case 1:
                    op = 1;
                    resu = n1 + n2;
                    System.out.print("\n El resultado de la suma es: " + resu);
                    break;

                case 2:
                    op = 2;
                    resu = n1 - n2;
                    System.out.print("\n El resultado de la resta es: " + resu);
                    break;
                    
                case 3:
                    op = 3;
                    resu = n1 * n2;
                    System.out.print("\n El resultado de la multiplicación es:"
                            + " " + resu);
                    break;
                    
                case 4:
                    op = 4;
                    resu = n1 / n2;
                    System.out.print("\n El resultado de la división"
                            + " es: " + resu);
                    break;
            }
        } while (op != 5 );
        System.out.print("\n ***Hasta luego!***");
        System.out.println("\n Muchas gracias" + "\n");

    }//Final

}
