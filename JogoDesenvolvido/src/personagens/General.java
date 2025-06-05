package personagens;

import armas.*;
import utils.Background;
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
        return "Personagem 03("
                + "nome= General"
                + ", vida=" + vida
                + ", defesa=" + defesa
                + ", Dano=" + arma.usarArma()
                + ')';
    }

    @Override
    public void desenhar(String tipo) {
        if (tipo.equalsIgnoreCase("personagem")) {
            Background.renderChar("/resources/Imagem_General.png", 200);
        } else {
            Background.renderChar("/resources/Imagem_General.png", 1200);
        }
    }

    @Override
    public void falar() {
        InOut.MsgDeInformacao("General", "Comando é poder. Siga-me para a vitória!");
    }

}
