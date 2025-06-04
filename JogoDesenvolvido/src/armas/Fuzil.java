package armas;

public class Fuzil implements Arma_IF {

    @Override
    public int usarArma() {
        return 40;
    }
    
    public int usarMetralhadora(int custo) {
        if (custo >= 30) {
            return 70;
        } else {
            throw new IllegalArgumentException("Custo insuficiente para usar metralhadora.");
        }
    }
}
