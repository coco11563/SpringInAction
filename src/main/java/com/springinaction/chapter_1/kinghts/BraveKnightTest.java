package com.springinaction.chapter_1.kinghts;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by sha0w on 17-3-15.
 */
public class BraveKnightTest {
    @Test
    public void KnightShouldEmbarkOnQuest() { //use mockito to test the interface!
        Quest mockQyest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQyest);
        knight.embarkOnQuest();
        verify(mockQyest, times(1)).embark();//failed if embark running more than one times
    }
}
