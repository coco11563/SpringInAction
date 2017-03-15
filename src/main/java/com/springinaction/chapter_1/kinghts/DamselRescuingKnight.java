package com.springinaction.chapter_1.kinghts;

/**
 * Created by sha0w on 17-3-15.
 *
 */
public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest quest;
    public DamselRescuingKnight() {
        quest = new RescueDamselQuest();//No DI
    }
    public void embarkOnQuest() {
        quest.embark();
    }
}
