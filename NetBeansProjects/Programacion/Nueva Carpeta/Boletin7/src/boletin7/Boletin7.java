package boletin7;

import javax.swing.JOptionPane;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin7 {
public static void main(String[] args) {
        Libro libro1 = new Libro("Robert", "Kielvs", 20, 0);
        Libro libro2 = new Libro("Edwin", "Rolls", 0, 4);

        if (libro1.prestamo() == true) {
            JOptionPane.showMessageDialog(null, "Prestamo realizado");

        } else {
            JOptionPane.showMessageDialog(null, "Prestamo no realizado");
        }

        if (libro2.prestamo() == true) {
            JOptionPane.showMessageDialog(null, "Prestamo realizado");

        } else {
            JOptionPane.showMessageDialog(null, "Prestamo no realizado");
        }

        Libro libro3 = new Libro("Charls", "Brown", 20, 0);

        if (libro3.devolucion() == true) {
            JOptionPane.showMessageDialog(null, "Devolucion realizada");

        } else {
            JOptionPane.showMessageDialog(null, "Devolucion no realizada");
        }
        System.out.println(libro3.toString());
    }
}