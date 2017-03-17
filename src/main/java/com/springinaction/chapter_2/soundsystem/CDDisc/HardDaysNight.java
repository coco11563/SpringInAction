package com.springinaction.chapter_2.soundsystem.CDDisc;

import org.springframework.stereotype.Component;

/**
 * Created by sha0w on 17-3-15.
 */
public class HardDaysNight implements CompactDisc {
    private String title = "Hard Days Night! We are Hi!";
    private String artist = "the Beatles";
    public void play() {
        System.out.println("play the " + title + " by " + artist);
    }
}
