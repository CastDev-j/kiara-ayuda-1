import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * La clase CatsApp es el punto de entrada de la aplicación. Se encarga de crear 
 * y mostrar la ventana principal de la aplicación, que contiene un panel de 
 * gatos (CatPanel).
 */
public class CatsApp {
 
    /**
     * El método principal (main) es el punto de entrada de la aplicación.
     * Se encarga de configurar y mostrar la ventana principal de la aplicación.
     * 
     * @param args Los argumentos de línea de comandos (no utilizados en esta aplicación).
     */
    public static void main(String[] args) {
        // Crear una nueva ventana (JFrame)
        JFrame frame = new JFrame();
        
        // Establecer el título de la ventana
        frame.setTitle("Cats App");
        
        // Hacer que la ventana no tenga bordes ni botones de control
        frame.setUndecorated(true);
        
        // Añadir el panel de gatos (CatPanel) a la ventana
        frame.add(new CatPanel());
        
        // Hacer que la ventana no sea redimensionable
        frame.setResizable(false);
        
        // Establecer el tamaño de la ventana
        frame.setSize(500, 600);
        
        // Centrar la ventana en la pantalla
        frame.setLocationRelativeTo(null);
        
        // Establecer la operación predeterminada al cerrar la ventana
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Hacer la ventana visible
        frame.setVisible(true);
    }
}