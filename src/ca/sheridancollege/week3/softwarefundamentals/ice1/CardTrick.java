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
public class CardTrick {
    
   public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        Scanner input = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++) {
           
            magicHand[i] = new Card();
            magicHand[i].setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i].setValue((int) (Math.random() * 14));
            
          }
        
        System.out.println("pick a card : ");
        System.out.println("select your suit :\n 1.Hearts \n 2.Diamonds \n 3.Spades \n 4.Clubs \n");
        String userSuit = input.next(); 
         System.out.println("Pick a value(1-13): ");
        int userValue = input.nextInt();
        
        boolean cardEqual = false;

        for (int i=0; i<magicHand.length; i++){
            if(userSuit.equals(magicHand[i].getSuit()) && userValue == magicHand[i].getValue()) {
                cardEqual = true;
            }
        }

        
        if (cardEqual) {
            printInfo();
        } else {
            System.out.println("Card is not same"); 
         }
   
    }
    
    //I'm done
    public static void printInfo() {
        System.out.println("I am Maryam Khatib,20, and an international student");
    }
    
}

