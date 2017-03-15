package com.springinaction.chapter_1.kinghts;

import org.springframework.context.annotation.Bean;

/**
 * Created by sha0w on 17-3-15.
 */
public class KnightConfig {
    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }
    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
