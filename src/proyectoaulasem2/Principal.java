
package proyectoaulasem2;

import proyectoaulasem2.ventanas.VentanaPrincipal;

/**
 *
 * @author 123cr
 */
public class Principal {
    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setExtendedState(VentanaPrincipal.MAXIMIZED_BOTH);
        ventana.setTitle("Sistema de Ventas");
        ventana.setVisible(true);
       
       
    }
}
