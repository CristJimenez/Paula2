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
    
   public static String rutaBase =  System.getProperty("user.home")+File.separator+"Datos-Producto";
   public static String nombreArchivo = "datos.prod";
   
   
   public static void guardar(HashMap<String, Producto>Bd) throws IOException{
       String rutaCompleta = rutaBase+File.separator+nombreArchivo;
         File archivo = new File(rutaCompleta);
         
      
         
       if(!archivo.exists()){
           
           File carpeta = new File (archivo.getParent());
           if(!carpeta.exists()){
               carpeta.mkdir();
           }
           archivo.createNewFile();
           
       }
       ObjectOutputStream cosa = new ObjectOutputStream(new FileOutputStream(archivo));
           cosa.writeObject(Bd);
           cosa.flush();
       
       
   }
    
   public static HashMap<String, Producto> retornar() throws Exception{
        String rutaCompleta = rutaBase+File.separator+nombreArchivo;
        File archivo = new File(rutaCompleta);
         if(!archivo.exists()){
           archivo.createNewFile();
           
           throw new Exception("La base de datos esta vacia ");
       }
      ObjectInputStream cosita = new ObjectInputStream(new FileInputStream(rutaCompleta)); 
      
      HashMap<String, Producto> ProductoBd = (HashMap<String, Producto>) cosita.readObject();
      return ProductoBd;
   }
    
    
    
    
}
