import java.util.ArrayList;

public class Estacion {

    // Atributos

    private int id = 0;
    private String direccion = "";
    private int numeroAnclajes = 0;
    private ArrayList<Integer> anclajes = new ArrayList<Integer>();

    // Constructor

    public Estacion(int id, String direccion, int numeroAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
    }

    // Metodos

    public int getId() {
        return this.id;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public int getNumeroAnclajes() {
        return this.numeroAnclajes;
    }

    /*
    public void checkStation() {
    }

    public String freeAnchorages() {
    }

    public void anchorBike(Bicicleta bicicleta) {
    }

    public void checkAnchorages() {
    }

    public String readUserCard(TarjetaUsuario tarjetaUsuario) {
    }

    public void removeBike(TarjetaUsuario tarjetaUsuario) {
    }
    */
}
