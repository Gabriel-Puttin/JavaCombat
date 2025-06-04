package personagens;

import armas.*;
import utils.InOut;

public class Soldado extends Personagem {
    
    public int stamina;

    public Soldado() {
        this.vida = 140;
        this.setArma(new Revolver());
        this.dano = arma.usarArma();
        this.defesa = 30;
    }

    @Override
    public String toString() {
        return "Personagem 02(" +
                "nome= Soldado" +
                ", vida=" + vida +
                ", defesa=" + defesa +
                ", Dano=" + arma.usarArma() +
                ')';
    }

    @Override
    public void desenhar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void falar() {
        InOut.MsgDeInformacao("Soldado", "Pronto para obedecer ordens e proteger com honra!");
    }
}
