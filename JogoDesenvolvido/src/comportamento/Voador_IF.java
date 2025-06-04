package comportamento;

import utils.InOut;

public interface Voador_IF {
    default void voar() {
        InOut.MsgDeInformacao("Saída", "O personagem saiu voando!");
    }
}
