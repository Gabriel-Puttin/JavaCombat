package personagens;

import armas.*;
import utils.InOut;

public class Mago extends Personagem {

    public int mana;

    public Mago() {
        this.vida = 160;
        this.setArma(new Magia());
        this.dano = arma.usarArma();
        this.defesa = 30;
    }

    @Override
    public String toString() {
        return "Personagem 04("
                + "nome= Mago"
                + ", vida=" + vida
                + ", defesa=" + defesa
                + ", Dano=" + arma.usarArma()
                + ')';
    }

    @Override
    public void desenhar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void falar() {
        InOut.MsgDeInformacao("Mago", "O poder arcano flui através de mim... a magia é meu aliado!");
    }
}
