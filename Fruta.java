package pntejercicio;

//clase Fruta que hereda de la superclase Producto
public class Fruta extends Producto {
    
    private String unidadVenta;

    public Fruta(String nombre, int precio, String unidadVenta) {

        super(nombre, precio);
        this.unidadVenta = unidadVenta;
    }
    
    // Sobreescritura del método toString()
    @Override
    public String toString(){
        return "Nombre: " + nombre + " /// " + "Precio: $" + precio + " /// " + "Unidad de venta: " + unidadVenta ;
    }
    
}
