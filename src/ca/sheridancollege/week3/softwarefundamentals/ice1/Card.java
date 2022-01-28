/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author dancye
 * @author Abarna Premachandran - Jan/27/2022
 * @modified by Megha Patel
 * @modified by Abarna Premachandran - 991430788
 */
public class Card {
    private String suit; //clubs, spades, diamonds, hearts
    private String value;//1-13

    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"}; //Array for card suits
    public static final String[] VALUE = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "K", "Q", "J"};// Array for card value
    public int randomIndex1 = (int) (Math.random() * SUITS.length);
    public int randomIndex2 = (int) (Math.random() * VALUE.length);
    public String card;
    public String userC;
    

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
     * 
     * @return the value
     */
    public String getValue() {
        return value;
    }
    /**
     * 
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
    /**
     * 
     * @return random suits from the suit array
     */
    public String newSuit() {

        return SUITS[randomIndex1];
    }
    /**
     * 
     * @return random value from the value array
     */
    public String newValue() {
        return VALUE[randomIndex2];
    }
    /**
     * 
     * @return random card with value and suit
     */
    public String newHand() {
        card=  VALUE[randomIndex2]+ " of " +SUITS[randomIndex1];
        return card;
    }
    /**
     * takes users input to create a card with value and suit
     * @param vUser
     * @param sUser
     * @return 
     */
 public String userCard(int vUser,int sUser) {
         userC= VALUE[vUser]+ " of " +SUITS[sUser];
        return userC;
 }
}
