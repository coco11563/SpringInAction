package com.springinaction.chapter_2.soundsystem;

import com.springinaction.chapter_2.soundsystem.CDDisc.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by sha0w on 17-3-15.
 *
 * 2.6 using auto wire to insert a CompactDisc into CD player
 */
public class CDPlayer implements MediaPlayer {
    private final CompactDisc cd;

    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

}
