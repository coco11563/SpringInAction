package com.springinaction.chapter_3.ambiguityBean.Annotation;

import com.springinaction.chapter_3.ambiguityBean.Annotation.Annotation.Ice;
import com.springinaction.chapter_3.ambiguityBean.Annotation.Dessert.Dessert;
import com.springinaction.chapter_3.ambiguityBean.Annotation.Dessert.Eater;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by sha0w on 17-3-17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AnnotationConfigure.class)
public class AnnotationTest {
    @Autowired
    @Ice
    private Dessert dessert;

    @Autowired
    private Eater eater;

    private Eater TYY;

    @Test
    public void doIGetTheDesset(){
        assertNotNull(dessert);
        dessert.eat();
    }

    @Test
    public void eating() {
        eater.eat();
    }
}
