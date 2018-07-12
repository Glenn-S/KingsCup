package com.skelton.glenn.kingscup;

import java.util.ArrayList;

public class Deck {
    private final int sizeOfDeck = 52;
    private final int numOfRules = 13;

    private ArrayList<Card> playingDeck = new ArrayList<Card>();
    private String rules[][] = {{"", ""}, // perhpas this should be in the resource folder under strings?
                                {"", ""}, // maybe a dictionary instead?
                                {"", ""},
                                {"", ""},
                                {"", ""},
                                {"", ""},
                                {"", ""},
                                {"", ""},
                                {"", ""},
                                {"", ""},
                                {"", ""},
                                {"", ""},
                                {"", ""}};

    public ArrayList<Card> createDeck(){
        // need to finish
        return this.playingDeck;
    }

    public void shuffleDeck(){
        return;
    }

    public Card drawCard(int turnNumber){
        if (turnNumber > (sizeOfDeck-1)){
            // not sure if this is the correct way of doing this
            throw new ArrayIndexOutOfBoundsException();
        }
        return playingDeck.get(turnNumber);
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
