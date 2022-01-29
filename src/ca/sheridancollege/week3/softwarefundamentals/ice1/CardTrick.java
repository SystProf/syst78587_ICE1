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
 * @author dancye
 * @modified by Megha Patel
 * @modified by Murtaza Mian Jan 25, 2022
 * 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Scanner input = new Scanner(System.in);
        String suit = "";
        
        for (int i=0; i<magicHand.length; i++)
        {
            magicHand[i] = new Card();
            magicHand[i].setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i].setValue((int)(Math.random() * (13 - 1 + 1) + 1));
//            System.out.println(magicHand[i].getValue() + " " + magicHand[i].getSuit());
//            commented out for debugging
        }
        
        System.out.print("Can you guess a card in a hand of 7?\nGuess the SUIT: (1.Hearts 2.Diamonds 3.Spades 4.Clubs): ");
        int suitGuess = input.nextInt();
        System.out.print("Guess a CARD (1-13): ");
        int value = input.nextInt();
        input.close();
        
        switch(suitGuess) {
            case 1: suit = "Hearts"; break;
            case 2: suit = "Diamonds"; break;
            case 3: suit = "Spades"; break;
            case 4: suit = "Clubs"; break;
        }
        
        boolean compare = false;
        for (int i=0; i<magicHand.length; i++) {
            if (magicHand[i].getValue() == value && suit.equals(magicHand[i].getSuit()))
                compare = true;
        }
        
//        System.out.println("You guessed: " + (compare == true ? "correctly" : "wrongly"));
        if (compare == true)
            printInfo();
        else 
            System.out.println("You guessed incorrectly");
    }
    
    // the assignment says to invoke the printInfo() method but there is none made so i assume it means to 
    // CREATE one, and the assignment says to only edit CardTrick.java, i've added it here.
    public static void printInfo() {
        
        System.out.println("You guessed correctly!");
        System.out.println("INFO ABOUT ME: Name - Murtaza, School - Sheridan College");
    }
}
