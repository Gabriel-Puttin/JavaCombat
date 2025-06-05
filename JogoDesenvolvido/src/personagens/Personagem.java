package personagens;

import armas.*;
import comportamento.Corredor_IF;

public abstract class Personagem implements Corredor_IF {

    public Arma_IF arma;
    public double vida;
    public int dano;
    public int defesa;

    public void setArma(Arma_IF arma) {
        this.arma = arma;
    }

    public void arma() {
        arma.usarArma();
    }

    public abstract void desenhar(String tipo);
    
    public abstract void falar();

    public void atacar(Personagem rival) {
        rival.vida = rival.vida - (this.dano - (rival.defesa * 0.1));
    }
}
