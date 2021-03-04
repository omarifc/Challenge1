
package pntejercicio;

//super clase Producto que implementa la interfaz 'Comparable' del tipo genérico Producto
abstract class Producto implements Comparable<Producto> {   
    protected String nombre;
    protected int precio;   
    
    //constructor
    public Producto (String nombre, int precio){        
    this.nombre = nombre;  
    this.precio = precio;
    
    }  
    
//getters para pedir los valores de los atributos   
public int getPrecio() {
        return precio;
    }

public String getNombre() {
        return nombre;
    }


// sobreescritura del metodo compareTo 
@Override
public int compareTo(Producto otroProd){
          /* se retorna un entero de la diferencia entre el precio con el precio de otro producto que viene
            como parámetro:
             positivo = el precio es el mayor
             negativo = el precio es el menor
             cero = el precio es igual
          */
          return this.getPrecio() - otroProd.getPrecio();
          
}
}
                      

