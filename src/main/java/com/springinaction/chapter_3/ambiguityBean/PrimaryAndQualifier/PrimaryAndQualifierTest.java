package com.springinaction.chapter_3.ambiguityBean.PrimaryAndQualifier;


import com.springinaction.chapter_3.ambiguityBean.PrimaryAndQualifier.Dessert.Dessert;
import com.springinaction.chapter_3.ambiguityBean.PrimaryAndQualifier.Dessert.Eater;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by sha0w on 17-3-17.
 * using primary and qualifier to solve this problem
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfigure.class)
public class PrimaryAndQualifierTest {
    @Autowired
    private Dessert dessert;

    @Autowired
    private Eater eater;

    private Eater TYY;

    @Test
    public void doIGetTheDesset(){
        assertNotNull(dessert);
    }
    @Test
    public void eating() {
        eater.eat();
    }

}
