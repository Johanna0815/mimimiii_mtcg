package com.mimimiii.dbutils.cards;

import lombok.Getter;

import java.lang.annotation.ElementType;

//damage | element type
public class Card {

    @Getter
    private String id;

    @Getter
    private String name;

    @Getter
    private float damage;

    @Getter
    private CardType cardType;        // enum // BUG -----nimmt er ned als min dtyp List<CardType> cardType;

    @Getter
    private ElementTypes elementTypes;

    public Card() {

    }


    public Card(String id, String name, float damage) {
        this.id = id;
        this.name = name;
        this.damage = damage;
    }

    public Card(String id, String name, float damage,CardType type, ElementTypes element) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        cardType = type;
        elementTypes = element;
    }
}
