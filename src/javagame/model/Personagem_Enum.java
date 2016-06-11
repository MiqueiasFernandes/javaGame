/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame.model;

/**
 *
 * @author mfernandes
 */
public class Personagem_Enum {

    public enum Lado {
        ESQUERDA,
        DIREITA
    }

    public enum Acao {
        AVANCAR,
        RECUAR,
        SALTAR,
        ABAIXAR,
        DEFENDER,
        ATACAR,
        IMOVEL
    }

    public enum Posicao {
        LEVANTADO,
        ABAIXADO,
        PULANDO
    }

    public static final char KEY_PERSONAGEM_A_RECUA = 'a';
    public static final char KEY_PERSONAGEM_A_AVANCA = 'd';
    public static final char KEY_PERSONAGEM_A_OCIOSO = 'z';
    public static final char KEY_PERSONAGEM_A_ATAQUE = 'x';
    public static final char KEY_PERSONAGEM_A_DEFESA = 'c';

    public static final char KEY_PERSONAGEM_B_RECUA = 'k';
    public static final char KEY_PERSONAGEM_B_AVANCA = 'h';
    public static final char KEY_PERSONAGEM_B_OCIOSO = 'b';
    public static final char KEY_PERSONAGEM_B_ATAQUE = 'n';
    public static final char KEY_PERSONAGEM_B_DEFESA = 'm';

    static public boolean pertence_A(char k) {

        return k == KEY_PERSONAGEM_A_AVANCA
                || k == KEY_PERSONAGEM_A_DEFESA
                || k == KEY_PERSONAGEM_A_OCIOSO
                || k == KEY_PERSONAGEM_A_RECUA
                || k == KEY_PERSONAGEM_A_ATAQUE;

    }

    static public boolean pertence_B(char k) {

        return k == KEY_PERSONAGEM_B_AVANCA
                || k == KEY_PERSONAGEM_B_DEFESA
                || k == KEY_PERSONAGEM_B_OCIOSO
                || k == KEY_PERSONAGEM_B_RECUA
                || k == KEY_PERSONAGEM_B_ATAQUE;

    }

}