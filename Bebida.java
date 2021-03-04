package pntejercicio;

//clase Bebida que hereda de la superclase Producto
public class Bebida extends Producto {
    
    private float litros;

    public Bebida(String nombre, int precio, float litros) {

        super(nombre, precio);
        this.litros = litros;
    }
    
    //sobreescritura del método toString()
    @Override
    public String toString(){
        return "Nombre: " + nombre + " /// " + "Litros: " + litros + " /// Precio: $" + precio;
    }
    
}
