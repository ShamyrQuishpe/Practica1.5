import javax.naming.CannotProceedException;
import javax.naming.SizeLimitExceededException;
import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        //Asignacion de cartas
        Carta carta1 = new Carta("As de picas");
        CartaNumerica carta2 = new CartaNumerica("Rey de Treboles",13);
        CartaNumerica carta0 = new CartaNumerica("Joker", 0);
        CartaNumerica carta3 = new CartaNumerica("Reina de As", 12);
        CartaEspecial carta_e= new CartaEspecial("Joker");

        System.out.println("Bienvenido al juego");
        System.out.println("Regla1: Si tu ultima carta es igual a 12, la dividimos por la anterior y si tu resultado es igual a 6 GANAS");
        System.out.println("Regla2: Si se divide para 0 automaticamente PIERDES");
        System.out.println("Regla3: Si tu total de puntos es 131313 GANAS");
        System.out.println("\nLas cartas elegidas al azar son las siguientes: ");
        System.out.println(carta2.getNombre_carta()+" "+carta2.getNumero_carta());
        System.out.println(carta0.getNombre_carta()+" "+carta0.getNumero_carta());
        System.out.println(carta3.getNombre_carta()+" "+carta3.getNumero_carta());

        //Envio de valores para convertir
         String trans1=carta2.transformacion();
         String trans2=carta0.transformacion();
         String trans3=carta3.transformacion();

        carta1.jugar(trans1, trans2, trans3);

        //Extraccion de numeros
        int num1=carta2.getNumero_carta();
        int num2=carta0.getNumero_carta();
        int num3=carta3.getNumero_carta();

        //Control de error de una division para 0
         try{
             if(num3==12){
                 double div=num1/num2;
                 System.out.println("Como el numero de tu 1er carta es igual a 12 lo dividimos para el anterior y si tu valor es igual a 6 ganas!!");
                 System.out.println("Tu resultado es: " + div);
             }
         }catch (Exception e){
             System.out.println("No fue posible dividir ya que no existe divisiones para 0, PERDISTE :(\n");
         }


    }
}