
package proyectoaulasem2.datos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author 123cr
 */
public class Cliente implements Serializable{
    public String nroDocumento;
    public String nombre;
    public String apellido;
    public String celular;
    public ArrayList<Venta> venta;
    public static HashMap<String, Cliente> ClientesBD = new HashMap<>();
}
