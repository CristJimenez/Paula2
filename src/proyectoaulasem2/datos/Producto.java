
package proyectoaulasem2.datos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author 123cr
 */
public class Producto implements Serializable{
    public String codigo;
    public String name;
    public double precio;
   public ArrayList <Producto> produtos;
    public static HashMap<String, Producto> ProductosBD = new HashMap<>();
}
