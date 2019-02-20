public class Estacion {

    // Atributos

    private int id = 0;
    private String direccion = null;
    private int numeroAnclajes = 0;
    private Bicicleta[] bicicletas;

    // Constructores

    public Estacion() {}

    public Estacion(int id, String direccion, int numeroAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
        this.bicicletas = new Bicicleta[numeroAnclajes];
    }

    // Getters

    public int getId() {
        return this.id;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public int getNumeroAnclajes() {
        return numeroAnclajes;
    }

    public Bicicleta[] getBicicletas() {
        return bicicletas;
    }

    // Metodos

    public void checkStation() {
        System.out.println("ID: " + getId() + "\n" + "Dirección: " + getDireccion());
    }

    public int freeAnchorages() {

        int anclajesLibres = 0;

        for (Bicicleta anclaje : this.bicicletas) {

            if (anclaje == null) {
                anclajesLibres++;
            }
        }
        return anclajesLibres;
    }

    public void anchorBike(Bicicleta bicicleta) {

        int posicion = 0;

        for (Bicicleta anclaje : this.bicicletas) {

            if (anclaje == null) {
                this.bicicletas[posicion] = bicicleta;
                showBike(bicicleta, posicion + 1);
                break;
            } else {
                posicion++;
            }
        }

    }

    public void showBike(Bicicleta bicicleta, int anclaje) {
        System.out.println("Bicicleta: " + bicicleta.getId() + " anclada en el anclaje: " + anclaje);
    }
    /*
    public void checkAnchorages() {
    }

    public String readUserCard(TarjetaUsuario tarjetaUsuario) {
    }

    public void removeBike(TarjetaUsuario tarjetaUsuario) {
    }
    */
}
