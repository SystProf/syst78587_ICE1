package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modified by Megha Patel
 * @modified by Volodymyr Suprun 2022/01/28
 * 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner input = new Scanner(System.in);
        for (int i=0; i<magicHand.length; i++)
        {
            //chooses random suit and value. Does not account for duplicates
            int randomSuit = (int)(Math.random() * 4);
            int randomValue = (int)((Math.random() * 13) + 1);
            Card c = new Card();
            c.setSuit(c.SUITS[randomSuit]);
            c.setValue(randomValue);
            magicHand[i] = c;
             }
        
        //initializing input values and counter.
        String suit;
        int val;
        int i;
        
        //do while looping input until it gives a valid suit. Not case-sensitive.
        do {
            System.out.println("Pick a valid card suit (Hearts, Diamonds, Spades, Clubs)");
            suit = input.nextLine();
            for (i = 0; i < 3; i++) {
                if (Card.SUITS[i].toLowerCase().equals(suit.toLowerCase())) {
                    break;
                }
            }
        }
        while (!(Card.SUITS[i].toLowerCase().equals(suit.toLowerCase())));
        
        //do while looping input until it gives a valid value.
        do {
            System.out.println("Pick a value that corresponds to a rank (1-13, where 1 is Ace, 13 is King, etc.)");
            val = input.nextInt();
        }
        while (!(val > 0 && val < 14));
        
        //Creates a Card object that has inputted values.
        Card yourCard = new Card();
        yourCard.setSuit(suit);
        yourCard.setValue(val);
        
        //Compares yourCard and the array of Card objects magicHand.
        int b = 0;
        while (b < 7) {
            if (magicHand[b].getSuit().toLowerCase().equals(yourCard.getSuit().toLowerCase())) {
                if (magicHand[b].getValue()== yourCard.getValue()) {
                    yourCard.printInfo();
                    break;
                }
            }
            b += 1;
            if (b == 7) {
                System.out.println("Your card is not in the magic hand...");
            }
        }
         }
    
}
