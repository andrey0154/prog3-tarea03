package uam.prog3.tarea03;

public class Bebida extends ItemMenu {
    private boolean grande;

    public Bebida(String nombre, double precioBase, boolean grande) {
        super(nombre, precioBase);
        this.grande = grande;
    }

    @Override
    public double calcularPrecio() {
        return grande ? getPrecioBase() + 500 : getPrecioBase();
    }

    @Override
    public String describir() {
        String texto = super.describir();
        if (grande) {
            texto += " (grande)";
        }
        return texto;
    }
}