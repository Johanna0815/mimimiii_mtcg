package com.mimimiii.dbutils.cards;

import lombok.Getter;

import java.lang.annotation.ElementType;

//damage | element type
public class Card {

    String cardName;

    private String id;


    public Card() {
    }

    public Card(String cardName) {
        this.cardName = cardName;
    }

    public getCardType(String) {

    }

    ;

    public removeCard(String cardName) {

        // this.cardName = cardName;

    }



    /*
    @Getter
    private String id;

    @Getter
    private String name;

    @Getter
    private float damage;

    @Getter
    private CardType cardType;        // enum // BUG -----nimmt er ned als min dtyp List<CardType> cardType;

    @Getter
    private ElementType elementType;


    public Card(String id, String name, float damage, CardType cardType, ElementTypes elementTypes) {
        this.id = id;
        this.name = name;
        this.damage = damage;
    }

    public Card(String id, String name, float damage,CardType type, ElementType element) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        cardType = type;
        elementType = element;
    }

     */
}
