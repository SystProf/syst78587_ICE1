/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modified by Megha Patel
 * 
 */

import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args){
        Scanner keys = new Scanner(System.in);

        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++){
            Card c = new Card();
            magicHand[i] = c;
        }

        System.out.println("===| Card Trick |===");
        System.out.println("Pick a card!");
        System.out.print("Suits:\n1. Hearts\n2. Diamonds\n3. Spades\n4. Clubs\n> ");
        int userSuit = keys.nextInt();
        System.out.println("Pick a number (1 - 13)");
        int userValue = keys.nextInt();

        for (int checkCard = 0; checkCard < magicHand.length; checkCard++) {
            if( (Card.SUITS[userSuit - 1].equals(magicHand[checkCard].getSuit())) && userValue == magicHand[checkCard].getValue() ){
                printInfo();
            }            
        }
        
    }

    // I'm done
    public static void printInfo(){
        System.out.println("Correct!");
    }
    
}
