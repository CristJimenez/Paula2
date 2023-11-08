
package proyectoaulasem2.bd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import proyectoaulasem2.datos.Cliente;

public class Almacenamiento {
    public static String rutaBase = System.getProperty("user.home")+File.separator+"Datos PA";
    public static String nombreArchivo = "datos.pa";
    
    public static void guardar(HashMap<String, Cliente> bd) throws IOException{
        String rutaCompleta = rutaBase+File.separator+nombreArchivo;
        File archivo = new File(rutaCompleta);
        if(!archivo.exists()){
            File carpeta = new File(archivo.getParent());
            if(!carpeta.exists()){
                carpeta.mkdir();
            }
            archivo.createNewFile();
        }
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));
        oos.writeObject(bd);
    }
    
    public static HashMap<String, Cliente> recuperar() throws Exception{
        String rutaCompleta = rutaBase+File.separator+nombreArchivo;
        File archivo = new File(rutaCompleta);
        if(!archivo.exists()){
            archivo.createNewFile();
            throw new Exception("La BD esta vacia");
        }
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo));
        HashMap<String, Cliente> clientesBd = (HashMap<String, Cliente>) ois.readObject();
        return clientesBd;
    }
}
