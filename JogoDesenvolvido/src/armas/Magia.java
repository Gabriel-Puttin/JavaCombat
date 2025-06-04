package armas;

public class Magia implements Arma_IF {

    @Override
    public int usarArma() {
        return 30;
    }

    public int usarMagiaSuprema(int custo) {
        if (custo >= 20) {
            return 70;
        } else {
            throw new IllegalArgumentException("Custo insuficiente para usar magia suprema.");
        }
    }

}
