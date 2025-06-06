package personagens;

import armas.Faca;
import comportamento.Corredor_IF;
import utils.Background;
import utils.InOut;

public class Orc extends Chefe implements Corredor_IF {

    public Orc() {
        this.vida = 400;
        this.defesa = 150;
        this.setArma(new Faca());
        this.poder = arma.usarArma();
        this.nivelDificuldade = 4;
    }

    @Override
    public void desenhar(String tipo) {
        if (tipo.equalsIgnoreCase("personagem")) {
            Background.renderChar("/resources/Imagem_Orc.png", 200);
        } else {
            Background.renderChar("/resources/Imagem_Orc.png", 1200);
        }
    }

    @Override
    public void falar() {
        InOut.MsgDeInformacao("Orc", "Eu sou a fúria da terra! Ninguém escapa da minha investida!");
    }

    @Override
    public String toString() {
        return "Personagem 06("
                + "nome= Ogro"
                + ", dificuldade=" + nivelDificuldade
                + ", vida=" + vida
                + ", defesa=" + defesa
                + ", poder=" + arma.usarArma()
                + ')';
    }
}
