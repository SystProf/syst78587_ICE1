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
 * @modified by Murtaza Mian Jan 25, 2022
 * @modified by Jacob O'Hearon
 */

import java.util.Scanner;

public class CardTrick 
{
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner input = new Scanner(System.in);
        Card c = new Card();
        String[] suits = new String[7];
        int[] values = new int[7];
        boolean answer = false;
        
        for (int i=0;i<magicHand.length;i++) 
        {
            c.setValue((int)(Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[((int)(Math.random()*3))]);
            System.out.println(c.getSuit() + " " + c.getValue());
            suits[i] = c.getSuit();
            values[i] = c.getValue();
        }
        
        System.out.print("Pick a card, any card: ");
        String guess1 = input.next();
        String guess2 = input.next();
            
        System.out.println("---------------");
        
        for(int i=0;i<magicHand.length;i++)
        {
            if(suits[i].equals(guess1))
            {
                if(guess2.equals(String.valueOf(values[i])))
                {
                    answer = true;
                }
            }
        }
        
        if(answer == true)
        {
            System.out.println("You guessed it!");   
        }
        else
        {
            System.out.println("Better luck next time!");
        }
    }
}
