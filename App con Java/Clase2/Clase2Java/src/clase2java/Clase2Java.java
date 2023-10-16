
package clase2java;

import javax.swing.JOptionPane;


public class Clase2Java {


    public static void main(String[] args) {
        String nom="Hader";
        int edad= 24;
        float peso= 62.4f;
        
        JOptionPane.showMessageDialog(null,
                    "Su nombre: "+nom
                    +"\n Su edad es: "+edad+" años"
                    +"\n Su peso es: "+peso+" Kg", 
                    "**\n Informe**",
                    JOptionPane.INFORMATION_MESSAGE);
    }
    
}
