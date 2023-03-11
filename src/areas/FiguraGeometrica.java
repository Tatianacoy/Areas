package areas;

import javax.swing.JOptionPane;

abstract class FiguraGeometrica {

    protected double base;
    protected double altura;
    protected double radio;
    protected double area;
    protected final double pi = 3.1416;

    public abstract void leerDatos();

    public abstract void calcularArea();

    public void mostrarResultado() {
        JOptionPane.showMessageDialog(null, "El área de la figura es: " + area);
    }

}
