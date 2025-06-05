package personagens;

import armas.*;
import utils.Background;
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
    public void desenhar(String tipo){
        if (tipo.equalsIgnoreCase("personagem")) {
            Background.renderChar("/resources/Imagem_Mago.png", 200);
        } else {
            Background.renderChar("/resources/Imagem_Mago.png", 1200);
        }
    }

    ;

    @Override
    public void falar() {
        InOut.MsgDeInformacao("Mago", "O poder arcano flui através de mim... a magia é meu aliado!");
    }
}
