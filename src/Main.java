public class Main {
    public static void main(String[] args) {
        // Puntajes de jugadores
        ServidorJuego servidor = new ServidorJuego();
        servidor.puntajes.put("Carlos", 1500);
        servidor.puntajes.put("Maria", 2300);
        servidor.puntajes.put("Pedro", 850);
        servidor.mostrarPuntajes();

        // Parte del guerrero
        Guerrero guerrero = new Guerrero();
        guerrero.nombre = "Thorin";
        guerrero.arma = "Espada legendaria";
        guerrero.presentarse();
        guerrero.entrenar();
        guerrero.atacar();

        // Parte del mago
        Mago mago = new Mago();
        mago.nombre = "Gandalf";
        mago.lanzarHechizo();
    }
}
