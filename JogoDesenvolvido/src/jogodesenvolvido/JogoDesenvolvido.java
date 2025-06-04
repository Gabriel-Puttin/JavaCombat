package jogodesenvolvido;

import utils.*;
import personagens.*;
import java.util.*;

public class JogoDesenvolvido {

    public static void main(String[] args) {
        Background.BackgroundUI();

        LutSumo sumo = new LutSumo();
        General general = new General();
        Soldado soldado = new Soldado();
        Mago mago = new Mago();
        DragaoAlado dragao = new DragaoAlado();
        Orc ogro = new Orc();

        String nome = InOut.leString("Digite seu nome:");
        InOut.MsgDeAviso("Grettings", "Olá jogador " + nome + " bem vindo ao jogo JAVA COMBAT!!!");
        String infos = ("""
                        Aqui est\u00e1 as informa\u00e7\u00f5es dos personagens: \r
                        """ + sumo + "\r\n" + soldado + "\r\n" + general + "\r\n" + mago + "\r\n"
                + "Aqui está as informações dos chefes: "
                + "\r\n" + dragao + "\r\n" + ogro);
        Background.print(infos);

        int numeroPersonagem = InOut.leInt("Escolhe o seu personagem");
        while (numeroPersonagem >= 5) {
            InOut.MsgDeErro("Erro", "Por favor escolha um número válido");
            numeroPersonagem = InOut.leInt("Escolhe o seu personagem");
        }

        HashMap<Integer, Personagem> personagens = new HashMap();
        personagens.put(1, sumo);
        personagens.put(2, soldado);
        personagens.put(3, general);
        personagens.put(4, mago);
        personagens.put(5, dragao);
        personagens.put(6, ogro);

        Personagem personagemEscolhido = personagens.get(numeroPersonagem);
        personagemEscolhido.falar();
        InOut.MsgDeAviso("Escolhido", "Seu personagem escolhido foi: " + personagemEscolhido.toString());

        int numeroRival = InOut.leInt("Escolhe o seu rival");
        while (numeroPersonagem >= 7) {
            InOut.MsgDeErro("Erro", "Por favor escolha um número válido");
            numeroPersonagem = InOut.leInt("Escolhe o seu personagem");
        }

        Personagem rivalEscolhido = personagens.get(numeroRival);
        rivalEscolhido.falar();
        InOut.MsgDeAviso("Escolhido", "Seu rival escolhido foi: " + rivalEscolhido.toString());
        InOut.MsgDeInformacao("Jogar", "O jogo vai começar!!!");
        boolean desistiu = false;

        while (personagemEscolhido.vida >= 0 && rivalEscolhido.vida >= 0) {
            String acao = InOut.leString("Escolha o que você deseja fazer. Atacar ou Recuar");
            if (acao.equalsIgnoreCase("Atacar")) {
                personagemEscolhido.atacar(rivalEscolhido);
            } else if (acao.equalsIgnoreCase("Recuar")) {
                personagemEscolhido.correr();
                desistiu = true;
                break;
            } else {
                InOut.MsgDeErro("Erro", "Escolha uma opção válida!");
                continue;
            }
            InOut.MsgDeAviso("Rival", "Agora o seu rival está atacando");
            rivalEscolhido.atacar(personagemEscolhido);
            InOut.MsgDeInformacao("Vidas", "A sua vida é de: " + personagemEscolhido.vida + "A vida do seu rival é: " + rivalEscolhido.vida);
        }

        if (!desistiu) {
            if (personagemEscolhido.vida >= 0) {
                InOut.MsgDeInformacao("Parabéns", "Parabéns!!! Você venceu o seu rival!");
            } else {
                InOut.MsgDeInformacao("Tristeza", "Que pena. Você perdeu!");
            }
        }
        InOut.MsgDeAviso("Fim", "Fim de jogo!");
    }
}
