package com.springinaction.kinghts;

import java.io.PrintStream;

/**
 * Created by sha0w on 17-3-15.
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;
    public SlayDragonQuest(PrintStream stream) { // CI
        this.stream = stream;
    }
    public void embark() {
        stream.println("Embarking on quest to slay the Dragon!!!");
    }
}
