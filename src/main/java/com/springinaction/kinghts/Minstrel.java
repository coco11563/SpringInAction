package com.springinaction.kinghts;

import java.io.PrintStream;

/**
 * Created by sha0w on 17-3-15.
 */
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream printStream) {
        stream = printStream;
    }

    public void singBeforeQuest() {
        stream.println("Fa La La, the knigh is so brave");
    }

    public void singAfterQuest() {
        stream.println("Tee Hee Hee, the brave knight did embark on a quest");
    }
}
