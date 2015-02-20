
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("Bienvenido al juego de la Ruleta Rusa");
        boolean resultado;
        juego duelo = new juego();
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cual es el tamaño del cargador? ");
        duelo.setBalas(entrada.nextInt());
        duelo.girar();
        do {
            System.out.println("¿Que quieres hacer? 1. Girar el tambor 2. Disparar ");
            if(entrada.nextInt()==1){
                resultado = duelo.girar();
            } else {
                resultado = duelo.disparar();
            }
        } while(resultado == false);

    }
}
