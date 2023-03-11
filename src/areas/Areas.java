package areas;

import javax.swing.JOptionPane;

public class Areas {

    public static void main(String[] args) {
        FiguraGeometrica figura = null;
        boolean sw = true;
        int opcion = 0;
        while (sw) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la figura a calcular: \n1. Cuadrado \n2. Circulo \n3. Salir"));
            switch (opcion) {
                case 1:
                    figura = new Cuadrado();
                    figura.leerDatos();
                    figura.calcularArea();
                    figura.mostrarResultado();
                    break;
                case 2:
                    figura = new Circulo();
                    figura.leerDatos();
                    figura.calcularArea();
                    figura.mostrarResultado();
                    break;

                case 3:
                    sw = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }

        }

    }

}
