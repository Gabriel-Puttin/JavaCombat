package personagens;

import comportamento.Voador_IF;
import utils.InOut;
import armas.Fogo;
import utils.Background;

public class DragaoAlado extends Chefe implements Voador_IF {

    public DragaoAlado() {
        this.vida = 500;
        this.defesa = 100;
        this.setArma(new Fogo());
        this.poder = arma.usarArma();
        this.nivelDificuldade = 5;
    }

    @Override
    public void desenhar(String tipo) {
        Background.renderChar("/resources/Imagem_Dragao.png", 1200);   
    }

    @Override
    public void falar() {
        InOut.MsgDeInformacao("Dragão Alado", "Você ousa me desafiar, humano?");
    }

    @Override
    public String toString() {
        return "Personagem 05("
                + "nome= Dragão"
                + ", dificuldade=" + nivelDificuldade
                + ", vida=" + vida
                + ", defesa=" + defesa
                + ", poder=" + arma.usarArma()
                + ')';
    }
}
