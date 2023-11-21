/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoaulasem2.bd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import proyectoaulasem2.datos.Gasto;

/**
 *
 * @author LUIS ALBERTO
 */
public class AlmacenamientoG {
     public static String rutaBase =  System.getProperty("user.home")+File.separator+"Datos-Gasto";
   public static String nombreArchivo = "datos.gastos";
   
   
   public static void guardar(HashMap<String, Gasto>Bd) throws IOException{
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
        oos.writeObject(Bd);
        oos.flush();
       
   }
    
   public static HashMap<String, Gasto> retornar() throws Exception{
        String rutaCompleta = rutaBase+File.separator+nombreArchivo;
        File archivo = new File(rutaCompleta);
         if(!archivo.exists()){
           archivo.createNewFile();
           
           throw new Exception("La base de datos esta vacia ");
       }
      ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaCompleta)); 
      
      HashMap<String, Gasto> VentaBd = (HashMap<String, Gasto>) ois.readObject();
      return VentaBd;
   }
    
}
