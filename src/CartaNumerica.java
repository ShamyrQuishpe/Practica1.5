public class CartaNumerica extends Carta {
    private int numero_carta;

    public CartaNumerica(String nombre_carta, int numero_carta) {
        super(nombre_carta);
        this.numero_carta = numero_carta;
    }

    public int getNumero_carta(){
        return numero_carta;
    }

    public void setNumero_carta(int numeroCarta){
        this.numero_carta=numeroCarta;
    }

    public String transformacion(){

        String dato1 = String.valueOf(numero_carta);
        return dato1;
    }
}

