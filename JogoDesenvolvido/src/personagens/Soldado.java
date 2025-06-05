package personagens;

import armas.*;
import utils.Background;
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
    public void desenhar(String tipo) {
        if (tipo.equalsIgnoreCase("personagem")) {
            Background.renderChar("/resources/Imagem_Soldado.png", 200);
        } else {
            Background.renderChar("/resources/Imagem_Soldado.png", 1200);
        }
    }

    @Override
    public void falar() {
        InOut.MsgDeInformacao("Soldado", "Pronto para obedecer ordens e proteger com honra!");
    }
}
