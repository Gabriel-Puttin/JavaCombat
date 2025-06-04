package armas;

public class Revolver implements Arma_IF {

    @Override
    public int usarArma() {
        return 25;
    }
    
    public int usarCanoDuplo(int custo) {
        if (custo >= 20) {
            return 50;
        } else {
            throw new IllegalArgumentException("Custo insuficiente para usar magia suprema.");
        }
    }
}
