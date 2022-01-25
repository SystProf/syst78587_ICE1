/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Suresh Sharma
 * @modified by Suresh Sharma - Jan 25, 2022
 * Student Number 991657093
 * 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Random rand = new Random();
            Card c = new Card();
            c.setValue(rand.nextInt(13)+1);
            c.setSuit(Card.SUITS[rand.nextInt(3)]);
            magicHand[i] = c;
        }
        
        for (int i = 0; i<magicHand.length; i++){
            System.out.println(magicHand[i].getValue() + " " + magicHand[i].getSuit());
        }
         
        Scanner in = new Scanner (System.in);
        System.out.println("Pick a card, any card");
        System.out.println("Value (integer value between 1-13): ");
        int cardValue = in.nextInt();
        System.out.println("Suit (capitalize first letter, ends with s. e.g. Spades): ");
        String cardSuit = in.next();
 
        boolean check = false;
        
        for(int i =0; i<magicHand.length; i++){
            if(magicHand[i].getValue() == cardValue && magicHand[i].getSuit().equals(cardSuit))
            {
                check = true;
                break;
            }
        }
        
        if(check){
            printInfo();
        }
        else{
            System.out.println("Your card does not exist in the hand of 7 random cards.");
        }
        
    }
    
    public static void printInfo(){
        System.out.println("Your card exists in the hand of 7 random cards.");
    }
    
}
