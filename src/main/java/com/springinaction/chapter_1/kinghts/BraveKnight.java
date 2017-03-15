package com.springinaction.chapter_1.kinghts;

/**
 * Created by sha0w on 17-3-15.
 * use DI
 */
public class BraveKnight implements Knight {
    private Quest quest;
    public BraveKnight(Quest quest) { //use constructor injection
        this.quest = quest;
    }
    public void embarkOnQuest() {
        quest.embark();
    }
}
