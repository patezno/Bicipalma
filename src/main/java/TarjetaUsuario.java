public class TarjetaUsuario {

    // Atributos

    private String id = "";
    private boolean activada = false;

    // Constructor

    public TarjetaUsuario(String id, boolean activada) {
        this.id = id;
        this.activada = activada;
    }

    // Metodos

    public String getId() {
        return this.id;
    }

    public boolean getActivada() {
        return this.activada;
    }

}
