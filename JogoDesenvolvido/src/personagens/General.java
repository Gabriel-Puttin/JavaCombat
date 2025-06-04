package personagens;

import armas.*;
import utils.InOut;

public class General extends Personagem {
    
    public General() {
        this.vida = 180;
        this.setArma(new Fuzil());
        this.dano = arma.usarArma();
        this.defesa = 40;
    }

    @Override
    public String toString() {
        return "Personagem 03(" +
                "nome= General" +
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
        InOut.MsgDeInformacao("General", "Comando é poder. Siga-me para a vitória!");
    }
    
}
