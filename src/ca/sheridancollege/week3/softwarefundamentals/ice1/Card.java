/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author Sathya Jeyachandran
 * @modified by Sathya Jeyachandran
 * @modified by Sathya Jeyachandran
 * 
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    /**
     * @return the suit
     */
   
   public Card(){
       Random r=new Random();
       int index=r.nextInt(SUITS.length);
       int number=r.nextInt((13-1)+1)+1;
        this.suit = SUITS[index];
       this.value = number;
   
   }
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
     * @param value 
     */
    public void setValue(int value) {
        this.value = value;
    }
    
   @Override
    public String toString(){
        return value + " of " + suit;
    }
    
    public void printInfo(){
        
        System.out.println(value + " of " + suit + " in the random hand");
       System.out.println("My name is Sathya Jeyachandran from India, I love my Family, Wish to become a very good programmer");
    }
    
