package pntejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PNTejercicio {

    public static void main(String[] args) {

        //Ingreso de los productos solicitados
        Bebida bebida1 = new Bebida ("Coca-Cola Zero", 20, 1.5f);
        Bebida bebida2 = new Bebida ("Coca-Cola", 18, 1.5f);
        HigienePersonal shampoo1 = new HigienePersonal ("Shampoo Sedal", 19, 500);
        Fruta fruta1 = new Fruta ("Frutillas", 64, "Kilo");
        
        //Genero una lista de Producto
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    
        //Agrego a la lista creada anteriormente los productos ingresados
        listaProductos.add(bebida1);
        listaProductos.add(bebida2);
        listaProductos.add(shampoo1);
        listaProductos.add(fruta1);
         
        //itero la lista de productos y se muestran como quedó determinado en el método toString sobreescrito
        for (Producto p : listaProductos) {
            System.out.println(p);            
        }
        
        /*se muestra el producto mas caro y el mas barato llamando a Collections min y max, Producto 
        implementa la interfaz Comparable*/
        
        System.out.println("=============================");
        System.out.println("Producto mas caro: " + Collections.max(listaProductos).getNombre());
        System.out.println("Producto mas barato: " + Collections.min(listaProductos).getNombre());
        
    }
}
