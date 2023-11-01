
package proyectoaulasem2.datos;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author 123cr
 */
public class Producto {
    public String codigo;
    public String name;
    public double precio;
   public ArrayList <Producto> produtos;
    public static HashMap<String, Producto> ProductosBD = new HashMap<>();
}
