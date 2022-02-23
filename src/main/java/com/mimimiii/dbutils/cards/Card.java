package com.mimimiii.dbutils.cards;

//damage | element type
public class Card {

    String cardName;

    private String id;


    public Card() {
    }

    public Card(String cardName) {
        this.cardName = cardName;
    }

    public Card(String string, String name, float aFloat, CardType cardType, ElementTypes elementTypes) {

    }

    public String getCardType(String cardName) {
return this.cardName;
    }

    ;

    public void removeCard(String cardName) {

        // this.cardName = cardName;

    }

    public String getId() {
        return this.id;
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

     */
}
