package com.springinaction.chapter_2.soundsystemnotautowiring;

import com.springinaction.chapter_2.soundsystem.CDDisc.*;
import com.springinaction.chapter_2.soundsystem.CDPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.SynchronousQueue;

/**
 * Created by sha0w on 17-3-15.
 * we dont use auto wiring now!
 * usring @Bean can make a bean without JAVA usecase
 */
@Configuration
public class CDPlayerConfig {


}
