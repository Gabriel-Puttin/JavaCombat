package personagens;

import utils.InOut;
import armas.*;

public class LutSumo extends Personagem {
    
    public LutSumo() {
        this.vida = 200;
        this.setArma(new Desarmado());
        this.dano = arma.usarArma();
        this.defesa = 50;
    }
    
    @Override
    public void desenhar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void falar() {
        InOut.MsgDeAviso("Sumo", "Minha força move montanhas. Prepare-se para o impacto!");
    }
    
    @Override
    public String toString() {
        return "Personagem 01(" +
                "nome= Sumô" +
                ", vida=" + vida +
                ", defesa=" + defesa +
                ", Dano=" + arma.usarArma() +
                ')';
    }
}
