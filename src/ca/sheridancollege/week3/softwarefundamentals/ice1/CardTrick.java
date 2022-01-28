/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Abarna Premachandran - Jan/27/2022
 * @modified by Megha Patel
 * @modified by Abarna Premachandran - 991430788
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Scanner selCard = new Scanner(System.in); //creating scanner class for user input

        // 7 card objects created
        Card c0 = new Card();
        c0.newHand();

        Card c1 = new Card();
        c1.newHand();

        Card c2 = new Card();
        c2.newHand();

        Card c3 = new Card();
        c3.newHand();

        Card c4 = new Card();
        c4.newHand();

        Card c5 = new Card();
        c5.newHand();

        Card c6 = new Card();
        c6.newHand();

        Card[] magicHand = new Card[7];// array of reference

        magicHand[0] = c0;
        magicHand[1] = c1;
        magicHand[2] = c2;
        magicHand[3] = c3;
        magicHand[4] = c4;
        magicHand[5] = c5;
        magicHand[6] = c6;

        System.out.println(); // empty line for space

        //printing the hand of 7cards
        for (Card c : magicHand) {

            System.out.println(c.newHand());
            System.out.println();
        }
        
        //pick a card game - asking user input to create users card choice
        System.out.println("Pick a card any card!");

        System.out.println("Enter a number form 0-12to make a card selection: 0forAce, 1for2, 2for3, 3for4, 4for5 ,5for6 ,6for7 ,7for8 ,8fpr9 ,9for10 ,10-king,11-queen,12-jack ");
        int userCardValue = selCard.nextInt();

        System.out.println("Enter a number to make a selection: 0-Hearts, 1-Diamonds, 2-Spades, 3-Clubs");
        int userCardSuit = selCard.nextInt();

        //calling card using method
        Card userChoice = new Card();
        userChoice.userCard(userCardValue, userCardSuit);
        System.out.println(userChoice.userCard(userCardValue, userCardSuit));

        //checking if the card the user picked is in the hand of random 7 cards and printing results
        if (userChoice.userCard(userCardValue, userCardSuit).equals(c0.newHand())) {
            System.out.println("the card is in the hand");
        } else if (userChoice.userCard(userCardValue, userCardSuit).equals(c1.newHand())) {
            System.out.println("the card is in the hand");
        } else if (userChoice.userCard(userCardValue, userCardSuit).equals(c2.newHand())) {
            System.out.println("the card is in the hand");
        } else if (userChoice.userCard(userCardValue, userCardSuit).equals(c3.newHand())) {
            System.out.println("the card is in the hand");
        } else if (userChoice.userCard(userCardValue, userCardSuit).equals(c4.newHand())) {
            System.out.println("the card is in the hand");
        } else if (userChoice.userCard(userCardValue, userCardSuit).equals(c5.newHand())) {
            System.out.println("the card is in the hand");
        } else if (userChoice.userCard(userCardValue, userCardSuit).equals(c6.newHand())) {
            System.out.println("the card is in the hand");
        } else {
            System.out.println("the card is not in the hand");
        }

    }

}
