/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame.decorador;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import javagame.estrategia.Estrategia;
import javagame.model.Personagem;

public class Corpo extends AbstractDecorador {

    public Corpo(IComponente decorado, Personagem personagem) {
        super(decorado, personagem);
        ocioso = getImage(getPropriedade("ocioso"));
        defendendo = getImage(getPropriedade("defendendo"));
        agredindo = getImage(getPropriedade("agredindo"));
        avancando = getImage(getPropriedade("avancando"));
        recuando = getImage(getPropriedade("recuando"));
    }

    @Override
    public void ocioso(Graphics graphics, ImageObserver imageObserver) {
        decorado.ocioso(graphics, imageObserver);
        pintarImagem(ocioso, imageObserver, graphics, true);
    }

    @Override
    public void agredindo(Graphics graphics, ImageObserver imageObserver) {
        decorado.agredindo(graphics, imageObserver);
        pintarImagem(agredindo, imageObserver, graphics, true);
    }

    @Override
    public void defendendo(Graphics graphics, ImageObserver imageObserver) {
        decorado.defendendo(graphics, imageObserver);
        pintarImagem(defendendo, imageObserver, graphics, true);
    }

    @Override
    public void avancando(Graphics graphics, ImageObserver imageObserver) {
        decorado.avancando(graphics, imageObserver);
        pintarImagem(avancando, imageObserver, graphics, true);
    }

    @Override
    public void recuando(Graphics graphics, ImageObserver imageObserver) {
        decorado.recuando(graphics, imageObserver);
        pintarImagem(recuando, imageObserver, graphics, true);
    }

    @Override
    public int pontosAdescontar(Estrategia estrategia) {
        return decorado.pontosAdescontar(estrategia) + 0;
    }

}
