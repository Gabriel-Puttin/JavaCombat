package armas;

public class Faca implements Arma_IF {

    @Override
    public int usarArma() {
        return 40;
    }
    
    public int usarEspada(int custo) {
        if (custo >= 20) {
            return 40;
        } else {
            throw new IllegalArgumentException("Custo insuficiente para usar espada.");
        }
    }
}
