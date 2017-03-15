package com.springinaction.kinghts;

/**
 * Created by sha0w on 17-3-15.
 * Use DI
 */
public class BraveQuest implements Quest {
    private String questName;
    public BraveQuest(String s) {
        this.questName = s; //construction injection
    }
    public void embark() {
        System.out.print("A brave knight has finish a " + questName + " brave quest!!!");
    }
}
