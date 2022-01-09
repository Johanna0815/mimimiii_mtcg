package com.mimimiii.dbutils;


import com.mimimiii.dbutils.battle.Battle;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Main {

    public static void main(String[] args) {

        //Thread starten für den server zum hören im hintergrund, könnte auch eienn 2. rest server starten.

 Battle battle = new Battle("huhu");


        System.out.println(battle.getMatched());



    }

}
