package proyectoaulasem2.bd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import proyectoaulasem2.datos.Producto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class AlmacenamientoP {
    public static String rutaBaze = System.getProperty("user.home")+File.separator+"datosProducto";
    public static String nombreArchibo = "datos.prod";
    
    public static void guardar2(HashMap<String, Producto> Bd) throws IOException{
        String rutaCompleta = rutaBaze+File.separator+nombreArchibo;
         File archivo = new File(rutaCompleta);
         
        if (!archivo.exists()){
            File carpeta = new File (archivo.getParent());
            if(!carpeta.exists()){
                carpeta.mkdir();
                
            }
            archivo.createNewFile();
            
        }
        
        ObjectOutputStream cosa = new ObjectOutputStream(new FileOutputStream(archivo));
        
        cosa.writeObject(Bd);
        
    }
    
    public static HashMap<String, Producto> retornar() throws Exception{
        String rutaCompleta = rutaBaze+File.separator+nombreArchibo;
         File archivo = new File(rutaCompleta);
         System.out.println("RUTA: "+archivo.getAbsolutePath());
          if (!archivo.exists()){
            archivo.createNewFile();
            throw new Exception ("La Bd esta vacia");
            
        }
          
          ObjectInputStream cosita = new ObjectInputStream(new FileInputStream(archivo));
          HashMap<String, Producto> ProductosBd = (HashMap<String, Producto>) cosita.readObject();
          return ProductosBd;
    }
    
}
