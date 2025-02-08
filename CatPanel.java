import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * La clase CatPanel es un componente visual (gráfico) que se utiliza para mostrar información
 * y botones en una interfaz de usuario. Esta clase extiende JPanel, que es una clase de Java Swing
 * utilizada para crear contenedores de componentes gráficos.
 * 
 * Esta clase muestra un mensaje y dos botones. Uno de los botones cambia el estado de un objeto Cat,
 * y el otro botón cierra la aplicación.
 */
public class CatPanel extends JPanel {
    // Etiqueta para mostrar mensajes
    private final JLabel messageLabel;

    // Constantes para definir tamaños y colores
    public static final int BUTTON_SIZE = 90, BUTTON_GAP = 3;
    public static final Color BACKGROUND = new Color(0x283C4F);
    public static final Color BORDER = new Color(0x097DC9);
    public static final Color TEXT_COLOR = new Color(0xDDE8E9);
    public static final Color SYMBOL_COLOR = new Color(0xFDFDFD);
    public static final Color MESSAGE_COLOR = new Color(0x3FE4C0);

    // Objeto Cat que se utilizará para mostrar y cambiar su estado
    private Cat cat = new Cat("Miau");

    /**
     * Constructor de la clase CatPanel. Configura el panel y sus componentes.
     */
    public CatPanel() {
        // Establecer el diseño y el fondo del panel
        setLayout(new GridBagLayout()); //  Establecer el diseño del panel
        setBackground(BACKGROUND); // Establecer el color de fondo
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Establecer el borde

        // Inicializar la etiqueta de mensaje
        messageLabel = new JLabel(); // Crear una nueva etiqueta
        messageLabel.setFont(new Font("Verdana", Font.BOLD, 20)); // Establecer la fuente y el tamaño del texto
        messageLabel.setForeground(MESSAGE_COLOR); // Establecer el color del texto
        messageLabel.setText(cat.toString()); // Establecer el texto inicial

        // Crear botón para salir de la aplicación
        JButton btnSalir = new JButton("Salir"); // Crear un nuevo botón con el texto "Salir"
        btnSalir.setFont(new Font("Verdana", Font.PLAIN, 16)); // Establecer la fuente y el tamaño del texto
        btnSalir.addActionListener(event -> System.exit(0)); // Cerrar la aplicación al hacer clic

        // Crear botón para cambiar el estado del objeto Cat
        JButton btnChangeState = new JButton("Change"); // Crear un nuevo botón con el texto "Change"
        btnChangeState.setFont(new Font("Verdana", Font.PLAIN, 16)); // Establecer la fuente y el tamaño del texto
        btnChangeState.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cambiar el estado del objeto Cat y actualizar el mensaje
                if (cat.getState().equals("HAMBRIENTO")) {
                    cat.setState("SLEEPING"); // Cambiar el estado a "SLEEPING"
                } else {
                    cat.setState("HAMBRIENTO"); // Cambiar el estado a "HAMBRIENTO"
                }
                messageLabel.setText(cat.toString()); // Actualizar el mensaje con el nuevo estado
            }
        });

        // Añadir componentes al panel con espaciado y padding
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(messageLabel, gbc);

        gbc.gridy = 1;
        add(btnChangeState, gbc);

        gbc.gridy = 2;
        add(btnSalir, gbc);
    }
}