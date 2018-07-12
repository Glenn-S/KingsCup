package com.skelton.glenn.kingscup;

import java.util.ArrayList;

public class Deck {
    private final int sizeOfDeck = 52;
    private final int numOfRules = 13;

    private ArrayList<Card> playingDeck = new ArrayList<Card>();
    private String rules[][] = new String[13][2]; // this is the working directory of rules for the game that will be initialized with the default rules
    // this is the default set of rules that can be reverted at any point (can get rid if not necessary)
    private String defaultRules[][] = {{"Make a Rule", "Player can make any rule they like. eg. \"No pointing\""}, // perhpas this should be in the resource folder under strings?
                                {"Give Two", "Give two drinks to the player of your choice. This may be split among two people"}, // maybe a dictionary instead?
                                {"Give Three", "Give three drinks to the player of your choice. This may be split among three people"},
                                {"Guys Drink", "All the people who identify as male take a drink"},
                                {"Girls Drink", "All the people who identify as female take a drink"},
                                {"Me", "You take a drink"},
                                {"You", "Select a player to take a drink"},
                                {"Rhyme Time", "The player selects a word that every body must rhyme with. Go around in a circle until somebody screws up. The person who messes up must drink"},
                                {"Never Have I Ever", "Go around in a circle playing never have I ever. Each person has three lives. The first person to lose all their lives must take a drink"},
                                {"7's", "Go around in a circle with each person counting the successive number. If a number with a 7 or a multiple of 7 is encountered, you must say fuck you instead of the number. The person who screws up must drink"},
                                {"Clothing Swap", "Pick two people to swap clothing"},
                                {"Hot Seat", "Go around in a circle with each asking the person who drew the card questions. If the player refuses to answer a question they drink"},
                                {"Sociables", "Everybody drinks"}};

    public ArrayList<Card> createDeck(){
        // need to finish
        return this.playingDeck;
    }

    public void shuffleDeck(){

    }

    /**
     * Purpose: To reset the rules to the default values from the defaultRules array
     */
    public void resetDeck(){

    }

    /**
     * Purpose: To select a card from the deck
     * @param turnNumber
     * @return Card
     */
    public Card drawCard(int turnNumber){
        if (turnNumber > (sizeOfDeck-1)){
            // not sure if this is the correct way of doing this
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.playingDeck.get(turnNumber);
    }

    /**
     * Purpose: To allow a card to be changed that already exists
     * @param rule
     * @param desc
     * @param card
     */
    public void editCard(String rule, String desc, Card card){
        if (!rule.equals(card.getRule())){
            card.setRule(rule);
        }
        if (!desc.equals(card.getDesc())){
            card.setDesc(desc);
        }
    }

    /* perhaps we don't need this since we can't have less than 52 cards and 13 rules unless we have
     a default value that it gets set back to? */
    public void deleteCard(){

    }

}
