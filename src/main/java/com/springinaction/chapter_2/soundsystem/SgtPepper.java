package com.springinaction.chapter_2.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by sha0w on 17-3-15.
 *
 */
@Component("longlyHeartsClubBand")
public class SgtPepper implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "the Beatles";
    public void play() {
        System.out.println("play the " + title + " by " + artist);
    }
}
