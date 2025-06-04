package comportamento;

import utils.InOut;

public interface Corredor_IF {
    default void correr() {
        InOut.MsgDeInformacao("Saída", "O personagem saiu correndo!");
    }
}
