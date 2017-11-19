/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package baralho;

import java.util.ArrayList;

/**
 *
 * @author Leonardo
 */
public class Jogador {

    private Cartas[] cartas;
    protected ArrayList<Cartas> hand;
    
    public void initialize(){
        this.hand = new ArrayList<>();
    }
    public Jogador(){
        this.cartas = Baralho.darCartas();
    }

    public void recebeCartas(){
        this.cartas = Baralho.darCartas();
    }
    
    public Cartas getCartasC(int i){
        return cartas[i];
    }
}
