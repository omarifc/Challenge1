package pntejercicio;

//clase HigienePersonal que hereda de la superclase Producto
public class HigienePersonal extends Producto {
    
    private int contenido;

    public HigienePersonal(String nombre, int precio, int contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }
    
    //Sobreescritura del método toString()
    @Override
    public String toString(){
        
        //declaro dos variables auxiliares
        String aux; 
        float auxContenido;
        
        /* a través de un if valido si el contenido va a ser mostrado como mililitros o litros según la cantidad
           que contenga el producto
        */
        
        //si es menor a 1000 el contenido se mostrará con mililitros
        if (this.contenido < 1000) {
            aux = "ml";
            return "Nombre: " + nombre + " /// " + "Contenido: " + contenido + aux + " /// " + "Precio: $" + precio;
        }
        //si es igual o mayor a 1000 el contenido se mostrará en litros
        else
            auxContenido = contenido/1000f;
            aux = "L";
            return "Nombre: " + nombre + " /// " + "Contenido: " + auxContenido + aux + " /// " + "Precio: $" + precio;        
    }
    
}
