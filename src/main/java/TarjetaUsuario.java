public class TarjetaUsuario {

    // Atributos

    private int id = 0;
    private boolean activada = false;

    // Constructor

    public TarjetaUsuario(int id, boolean activada) {
        this.id = id;
        this.activada = activada;
    }

    // Metodos

    public int getId() {
        return this.id;
    }

    public boolean getActivada() {
        return this.activada;
    }

}
