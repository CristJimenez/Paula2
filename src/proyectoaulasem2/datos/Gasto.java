
package proyectoaulasem2.datos;
import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author 123cr
 */
public class Gasto implements Serializable{
    public String documento;
    public Date fecha;
    public double valor;
    public String nombre;
    public String detalles;
    public ArrayList <Gasto> gastos;
    public static HashMap<String, Gasto> GastosBD = new HashMap<>();
    

    
    
}
