package areas;

import javax.swing.JOptionPane;

public class Cuadrado extends FiguraGeometrica {

    @Override
    public void leerDatos() {
        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la base"));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la altura "));
    }

    @Override
    public void calcularArea() {
        area = base * altura;
    }

}
