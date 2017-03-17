package com.springinaction.chapter_2.soundsystem.CDDisc;

import org.springframework.stereotype.Component;

/**
 * Created by sha0w on 17-3-15.
 */
public class WhiteAlbum implements CompactDisc {
    private String title = "WTF??? White Album???";
    private String artist = "the NicoNico";
    public void play() {
        System.out.println("play the " + title + " by " + artist);
    }
}
