package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack = 11, Queen = 12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author dancye
 * @modified by Megha Patel
 * @modified by Volodymyr Suprun 2022/01/28
 * 
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    
    public void printInfo() {
        //I'm done
        System.out.println("Hello, My name is Volodymyr Suprun. I am a first year SDNE student.");
        //Switch statement used to print out what rank a card is depending on its value
        switch (this.value) {
            case 1:
                System.out.println("Your card is the Ace of " + this.suit + " and it is in the magic hand!");
                break;
            case 2:
                System.out.println("Your card is the Two of " + this.suit + " and it is in the magic hand!");
                break;
            case 3:
                System.out.println("Your card is the Three of " + this.suit + " and it is in the magic hand!");
                break;
            case 4:
                System.out.println("Your card is the Four of " + this.suit + " and it is in the magic hand!");
                break;
            case 5:
                System.out.println("Your card is the Five of " + this.suit + " and it is in the magic hand!");
                break;
            case 6:
                System.out.println("Your card is the Six of " + this.suit + " and it is in the magic hand!");
                break;
            case 7:
                System.out.println("Your card is the Seven of " + this.suit + " and it is in the magic hand!");
                break;
            case 8:
                System.out.println("Your card is the Eight of " + this.suit + " and it is in the magic hand!");
                break;
            case 9:
                System.out.println("Your card is the Nine of " + this.suit + " and it is in the magic hand!");
                break;
            case 10:
                System.out.println("Your card is the Ten of " + this.suit + " and it is in the magic hand!");
                break;
            case 11:
                System.out.println("Your card is the Jack of " + this.suit + " and it is in the magic hand!");
                break;
            case 12:
                System.out.println("Your card is the Queen of " + this.suit + " and it is in the magic hand!");
                break;
            case 13:
                System.out.println("Your card is the King of " + this.suit + " and it is in the magic hand!");
                break;
        }
    }
}
