package areas;

import javax.swing.JOptionPane;

public class Circulo extends FiguraGeometrica {

    @Override
    public void leerDatos() {
        radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el radio"));
    }

    @Override
    public void calcularArea() {
        area = pi * (radio * radio);
    }
}
