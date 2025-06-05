package personagens;

import utils.InOut;
import armas.*;
import utils.Background;

public class LutSumo extends Personagem {

    public LutSumo() {
        this.vida = 200;
        this.setArma(new Desarmado());
        this.dano = arma.usarArma();
        this.defesa = 50;
    }

    @Override
    public void desenhar(String tipo) {
        if (tipo.equalsIgnoreCase("personagem")) {
            Background.renderChar("/resources/Imagem_Sumo.png", 200);
        } else {
            Background.renderChar("/resources/Imagem_Sumo.png", 1200);
        }
    }

    @Override
    public void falar() {
        InOut.MsgDeAviso("Sumo", "Minha força move montanhas. Prepare-se para o impacto!");
    }

    @Override
    public String toString() {
        return "Personagem 01("
                + "nome= Sumô"
                + ", vida=" + vida
                + ", defesa=" + defesa
                + ", Dano=" + arma.usarArma()
                + ')';
    }
}
