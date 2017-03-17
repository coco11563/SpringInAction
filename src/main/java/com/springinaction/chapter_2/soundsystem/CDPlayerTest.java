package com.springinaction.chapter_2.soundsystem;

import com.springinaction.chapter_2.soundsystem.CDDisc.CompactDisc;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by sha0w on 17-3-15.
 * testing the cd player make sure the component has been scan
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    private CompactDisc cd;
    private MediaPlayer player;
    private  AnnotationConfigApplicationContext annotationConfigApplicationContext;

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();
    @Before
    public void init(){
        annotationConfigApplicationContext = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
    }

    @Test
    public void cdShouldNotBeNull() {
        cd = (CompactDisc) annotationConfigApplicationContext.getBean("randomBeatlesCD");
        assertNotNull(cd);
    }

    @Test
    public void testPlayer() {
        player = (MediaPlayer) annotationConfigApplicationContext.getBean("cdPlayer");
        player.play();
        assertEquals("play the Sgt. Pepper's Lonely Hearts Club Band by the Beatles\n", log.getLog());
    }
}
