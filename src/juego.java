
public class juego {

    int cargador = 0;
    int disparo = 0;
    int posiBala = 0;

    public boolean setBalas(int balas) {
        cargador = balas;
        return false;
    }

    public boolean girar() {
        posiBala = (int) Math.round(Math.random() * cargador + 1);
        return false;
    }

    public boolean disparar() {
        disparo++;
        if (disparo > cargador){
            posiBala = 1;
        }
        if (disparo == posiBala) {
            if (disparo % 2 == 0) {
                System.out.println("Tu oponente se ha suicidado, tu ganas.");
                return true;
            } else {
                System.out.println("Te has volado la cabeza... ");
                System.out.println("Mentira!");
                return true;
            }
        } else {
            System.out.println("...No ha pasado nada.");
            return false;
        }
    }
}
