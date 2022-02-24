package com.mimimiii.dbutils.cards;

import lombok.Getter;

//damage | element type
public class Card {

    String cardName;

    private String id;

    private float damage;

    private CardType cardType;


    private ElementTypes elementTypes;



    public Card() {

    }

    public Card(String cardName) {
        this.cardName = cardName;
    }

    public Card(String id, String cardName, float damage,CardType type, ElementTypes element) {
        this.id = id;
        this.cardName = cardName;
        this.damage = damage;
        cardType = type;
        elementTypes = element;
    }


    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public ElementTypes getElementType() {
        return elementTypes;
    }

    public void setElementType(ElementTypes elementType) {
        this.elementTypes = elementType;
    }





    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }


    public double getName() {
        return 0;
    }
}
