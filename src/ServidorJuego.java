import java.util.HashMap;
import java.util.Map;

public class ServidorJuego {
    Map<String, Integer> puntajes = new HashMap<>();

    public void mostrarPuntajes() {
        System.out.println(puntajes);
    }
}
