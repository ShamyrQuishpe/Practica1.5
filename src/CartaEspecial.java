public class CartaEspecial extends Carta {

    public CartaEspecial(String nombre_carta) {
        super(nombre_carta);
    }

    public void activarEfectoEspecial() {
        System.out.println("Se ha activado el efecto especial de la carta");
    }
}