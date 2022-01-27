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
 * @modified by Megha Patel and Gabriel Braga (Student ID: 991606560)
 * @date 2022-01-25
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            magicHand[i] = new Card();
            
           // Setting randomly the suit and values
            magicHand[i].setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i].setValue((int) (Math.random() * 13 + 1));
            
            System.out.println(magicHand[i].getSuit());
            System.out.println(magicHand[i].getValue());
            
        }

    }
    
}
