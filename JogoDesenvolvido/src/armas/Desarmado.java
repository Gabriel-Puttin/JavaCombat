package armas;

public class Desarmado implements Arma_IF {
    
    @Override
    public int usarArma() {
        return 30;
    }
    
    public int usarGolpeCorpo(int custo) {
        if (custo >= 50) {
            return 100;
        } else {
            throw new IllegalArgumentException("Custo insuficiente para usar golpe corpo.");
        }
    }
}
