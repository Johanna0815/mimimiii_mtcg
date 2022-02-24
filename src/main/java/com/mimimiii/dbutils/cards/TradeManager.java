package com.mimimiii.dbutils.cards;

public class TradeManager {

    public static TradeManager single_instance = null;

        public static TradeManager getInstance()
        {
            if (single_instance == null) {
                single_instance = new TradeManager();
            }
            return single_instance;
        }

    }




