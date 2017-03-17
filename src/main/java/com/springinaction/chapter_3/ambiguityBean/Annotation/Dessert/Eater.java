package com.springinaction.chapter_3.ambiguityBean.Annotation.Dessert;


import com.springinaction.chapter_3.ambiguityBean.Annotation.Annotation.Ice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by sha0w on 17-3-17.
 * this guy wanna eat ice cream
 */
@Component
public class Eater {
    private String name = "TYY";

    @Autowired
    @Ice
    private Dessert dessert;

    public void eat() {
        System.out.print(name + " wanna eat ice-cream and ");
        dessert.eat();
    }
}
