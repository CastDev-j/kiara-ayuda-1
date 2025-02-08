/**
 * La clase Cat modela un gato con un nombre y un estado.
 * Proporciona métodos para obtener y establecer el nombre y el estado del gato.
 * También sobrescribe el método toString para proporcionar una representación
 * en cadena del estado del gato.
 */
public class Cat {
    // Atributo que almacena el nombre del gato
    private String name;
    
    // Atributo que almacena el estado del gato (por defecto, "HAMBRIENTO")
    private String stateName;

    /**
     * Constructor que inicializa el nombre del gato y establece el estado inicial a "HAMBRIENTO".
     *
     * @param name El nombre del gato.
     */
    public Cat(String name){
        this.name = name;
        this.stateName = "HAMBRIENTO";
    }

    /**
     * Método para obtener el nombre del gato.
     *
     * @return El nombre del gato.
     */
    public String getName() {
        return name;
    }

    /**
     * Método para establecer el nombre del gato.
     *
     * @param name El nuevo nombre del gato.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para establecer el estado del gato.
     *
     * @param state El nuevo estado del gato.
     */
    public void setState(String state) {
        this.stateName = state;
    }

    /**
     * Método para obtener el estado del gato.
     *
     * @return El estado del gato.
     */
    public String getState(){
        return stateName;    
    } 

    /**
     * Sobrescribe el método toString para proporcionar una representación en cadena del estado del gato.
     *
     * @return Una cadena que representa el nombre y el estado del gato.
     */
    @Override
    public String toString() { 
        return "Cat{" + name + ", " + stateName + '}';
    }
}