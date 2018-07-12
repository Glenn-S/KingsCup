package com.skelton.glenn.kingscup;

/**
 * Purpose: To create an instance of a playing card that will have the rule, its description, and an
 * Image associated with that card
 */
public class Card {
    private String cardRule;
    private String cardDescription;
    // Associated image with card


    public Card(String rule, String desc){
        this.cardRule = rule;
        this.cardDescription = desc;
    }

    /**
     *
     * @return the rule for a given card
     */
    public String getRule(){
        return this.cardRule;
    }

    /**
     *
     * @return the description for a given card
     */
    public String getDesc(){
        return this.cardDescription;
    }

    public void getCardImage(){
        // to be filled in
    }

    public void setRule(String newRule){
        this.cardRule = newRule;
    }

    public void setDesc(String newDesc){
        this.cardDescription = newDesc;
    }

    public void setCardImage(){
        // to be filled in
    }
}
