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
 * @modified by Megha Patel and Gabriel Braga (Student ID: 991606560)
 * @date 2022-01-27
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
        }

        Scanner input = new Scanner(System.in);

        //Asking the user to pick a card, storing the chosen card suit and value
        System.out.println("Welcome to the Card Trick game. Please pick a card");
        System.out.println("First choose the suit. Please select:\n Hearts\n Diamonds\n Spades\n Clubs\n");

        String userSuit = input.next();
    
        System.out.println("Now it is time to choose the value. Please press:\n 1 for Ace\n 2 to 10 for corresponding value\n 11 for Jack \n 12 for King\n 13 for Queen\n");
        int userValue = input.nextInt();

        //Checking whether the user card is contained on magic hand

        //sentinel value
        boolean cardOnMagicHand = false;

        for (int i=0; i<magicHand.length; i++){
            if(userSuit.equals(magicHand[i].getSuit()) && userValue == magicHand[i].getValue()) {
                cardOnMagicHand = true;
            }
        }

        //Displays the game result
        if (cardOnMagicHand) {
            printInfo(userSuit, userValue);
        } else {
            System.out.println("I'm sorry. Your card is not on the magic hand!");
        }   
    }

    //Method to output the game result if the card is on the magic hand
    public static void printInfo(String suit, int number) {
        System.out.println("Congratulations! The card " + suit + " " + number + " is on the magic hand!");
    }
}

