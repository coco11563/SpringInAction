package com.springinaction.chapter_2.soundsystem.CDDisc;

import org.springframework.stereotype.Component;

/**
 * Created by sha0w on 17-3-15.
 */
public class Revolve implements CompactDisc {
    private String title = "We try to revolve, but we die!";
    private String artist = "the Beatles";
    public void play() {
        System.out.println("play the " + title + " by " + artist);
    }
}