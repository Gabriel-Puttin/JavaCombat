package personagens;

public class Chefe extends Personagem {
    
    public int poder;
    public int nivelDificuldade;

    @Override
    public void desenhar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void falar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void atacar(Personagem rival) {
        rival.vida = rival.vida - (this.poder - (rival.defesa * 0.1));
    }
    
}
