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
import java.util.Scanner;
import java.util.ArrayList;
public class PokerGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** variable initializations and declarations**/
        int i;
        ArrayList players = new ArrayList<String>();
        
        /**Start of Game - asks for number of players**/
        System.out.println("Enter number of players: ");
        Scanner num = new Scanner (System.in);
        int numPlayers = num.nextInt();
        
        /**Instantiation of Player Class/Objects**/
       for(i=1;i<=numPlayers; i++){
           System.out.println("Enter name for Player "+i);
           Scanner scan = new Scanner (System.in);
           String name = scan.nextLine ();
           players.add(name);
       }
        
    }
    
}
