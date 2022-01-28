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
 * 
 * @modified by Sathya Jeyachandran
 * 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
         Random r = new Random();
        Scanner in = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        int count = 0;
        
        // iterate through aray, for each spot in the array, create new card
        for(int i = 0; i < magicHand.length; i++){
            magicHand[i] = new Card();
        }
        
        // iterate through array, print the card to console
        for(int i = 0; i < magicHand.length; i++){
            System.out.println(magicHand[i].toString());
        }
        
        System.out.println("Enter a card in the given array Example:4,Spades");
        // gets the user input
        String userCardInput = in.next();
        // split user input into array by the comma
        String[] cardArray = userCardInput.split(",");
        // convert from String to int
        int number = Integer.parseInt(cardArray[0]);
        String pickSuit = cardArray[1];
        
        
        // iterate through the magicHand, determine if user input is same as one of the cards, then add 1
        boolean result = true;
        for(int i = 0; i < magicHand.length; i++){
            if(magicHand[i].getValue() == number && magicHand[i].getSuit().equals(pickSuit)){
                result= false;
                magicHand[i].printInfo();
            }

        }
        if(result){
            System.out.println("Your input does not exist in the magic hands");
        }
    }
    
}