/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poker.game;

/**
 *
 * @author ferolinma_cis21035
 */
public class Player{
    int totalChips;
    int chips;
    String name = new String();
    public Player (String name, int chips) {
        this.totalChips = 500;
        this.name = name;
        this.chips = chips;
    }
     public void display(){
        System.out.println(name + chips);
    }
}
