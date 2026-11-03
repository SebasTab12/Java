public class Guerrero extends Personaje implements Combate {
    String arma;

    public void entrenar() {
        System.out.println(nombre + " esta entrenando con su arma " + arma);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca infligiendo 100 de dano!");
    }
}
