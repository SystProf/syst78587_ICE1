/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modified by Megha Patel
 * @date Tuesday, January 25th, 2022
 * @student id 991614881
 * 
 */
public class CardTrick {
    
    Card printOutput = new Card();
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13 + 1));
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            
            Scanner input = new Scanner(System.in);
            System.out.println("Please pick a card: ");
            Card.playerSuit = input.nextLine();
            
            System.out.println("Please choose a value for the card from 1 to 7: ");
            Card.playerValue = input.nextInt();
            
            if(Card.playerSuit.equals(c.getSuit()) && Card.playerValue == c.getValue()) {
                Card.printInfo();
            }
                
            else{
                System.out.println("Your card was " + Card.playerSuit +  " " + Card.playerValue + " and was not in the "
                        + "hand of cards. \nThe cards in the hand were: \n" + c);
                break;
            }
        }
    }
}
