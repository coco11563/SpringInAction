package com.springinaction.chapter_2.soundsystem;

import com.springinaction.chapter_2.soundsystem.CDDisc.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sha0w on 17-3-15.
 * Not AutoWiring
 */
@Configuration
public class CDPlayerConfig {
    @Bean(name = "randomBeatlesCD")
    public CompactDisc randomBeatlesCD() {
        int choice = (int) Math.floor(Math.random() * 4);
        if (choice == 0) {
            return new SgtPepper();
        } else if (choice == 1) {
            return new WhiteAlbum();
        } else if (choice == 2) {
            return new HardDaysNight();
        } else {
            return new Revolve();
        }
    }
    @Bean(name = "lonelyHeartsClubBandMadeByJavaConfig")
    public CompactDisc sgtPepper() {
        return new SgtPepper();
    }

    @Bean(name = "cdPlayer")
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPepper());
    }
}
