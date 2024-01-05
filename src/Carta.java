public class Carta {
    private String nombre_carta;
    public Carta(String nombre_carta){
        this.nombre_carta=nombre_carta;
    }
    public String getNombre_carta(){
        return nombre_carta;
    }
    public void setNombre_carta(String nombre_carta){
        this.nombre_carta=nombre_carta;
    }
    //metodo jugar
    public void jugar(String dato1, String dato2, String dato3){
        System.out.println("Has jugado las cartas tu total de puntos es de: " + (dato1+dato2+dato3) );
    }
    public void mostrarDescripcion(){
        System.out.println("La descripcion de la carta es: " + nombre_carta);
    }
}
