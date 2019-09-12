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
public class Card {
    int columns = 4;
    int rows = 13;
    int r,c;
    String [][] cardDeck;
    public Card() {
        this.cardDeck = new String[rows][columns];
        this.cardDeck[0][0] = "Ace of Diamonds";
        this.cardDeck[0][1] = "Ace of Clubs";
        this.cardDeck[0][2] = "Ace of Spades";
        this.cardDeck[0][3] = "Ace of Hearts";
        this.cardDeck[1][0] = "2 of Diamonds";
        this.cardDeck[1][1] = "2 of Clubs";
        this.cardDeck[1][2] = "2 of Spades";
        this.cardDeck[1][3] = "2 of Hearts";
        this.cardDeck[2][0] = "3 of Diamonds";
        this.cardDeck[2][1] = "3 of Clubs";
        this.cardDeck[2][2] = "3 of Spades";
        this.cardDeck[2][3] = "3 of Hearts";
        this.cardDeck[3][0] = "4 of Diamonds";
        this.cardDeck[3][1] = "4 of Clubs";
        this.cardDeck[3][2] = "4 of Spades";
        this.cardDeck[3][3] = "4 of Hearts";
        this.cardDeck[4][0] = "5 of Diamonds";
        this.cardDeck[4][1] = "5 of Clubs";
        this.cardDeck[4][2] = "5 of Spades";
        this.cardDeck[4][3] = "5 of Hearts";
        this.cardDeck[5][0] = "6 of Diamonds";
        this.cardDeck[5][1] = "6 of Clubs";
        this.cardDeck[5][2] = "6 of Spades";
        this.cardDeck[5][3] = "6 of Hearts";
        this.cardDeck[6][0] = "7 of Diamonds";
        this.cardDeck[6][1] = "7 of Clubs";
        this.cardDeck[6][2] = "7 of Spades";
        this.cardDeck[6][3] = "7 of Hearts";
        this.cardDeck[7][0] = "8 of Diamonds";
        this.cardDeck[7][1] = "8 of Clubs";
        this.cardDeck[7][2] = "8 of Spades";
        this.cardDeck[7][3] = "8 of Hearts"; 
        this.cardDeck[8][0] = "9 of Diamonds";
        this.cardDeck[8][1] = "9 of Clubs";
        this.cardDeck[8][2] = "9 of Spades";
        this.cardDeck[8][3] = "9 of Hearts";
        this.cardDeck[9][0] = "10 of Diamonds";
        this.cardDeck[9][1] = "10 of Clubs";
        this.cardDeck[9][2] = "10 of Spades";
        this.cardDeck[9][3] = "10 of Hearts";
        this.cardDeck[10][0] = "Jack of Diamonds";
        this.cardDeck[10][1] = "Jack of Clubs";
        this.cardDeck[10][2] = "Jack of Spades";
        this.cardDeck[10][3] = "Jack of Hearts";
        this.cardDeck[11][0] = "Queen of Diamonds";
        this.cardDeck[11][1] = "Queen of Clubs";
        this.cardDeck[11][2] = "Queen of Spades";
        this.cardDeck[11][3] = "Queen of Hearts";
        this.cardDeck[12][0] = "King of Diamonds";
        this.cardDeck[12][1] = "King of Clubs";
        this.cardDeck[12][2] = "King of Spades";
        this.cardDeck[12][3] = "King of Hearts";
        for (r=0; r<rows; r++){
            for (c=0; c<columns; c++){
                System.out.println(cardDeck[r][c]);
            }
            System.out.println("\n");
        }
    }
   
    
}
