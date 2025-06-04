package armas;

public class Fogo implements Arma_IF {

    @Override
    public int usarArma() {
        return 60;
    }
    
    public int rajadaDeFogo(int custo) {
        if (custo >= 3) {
            return 200;
        } else {
            throw new IllegalArgumentException("Custo insuficiente para usar metralhadora.");
        }
    }
}
