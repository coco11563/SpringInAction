package com.springinaction.chapter_3.ambiguityBean.PrimaryAndQualifier.Dessert;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by sha0w on 17-3-17.
 */
@Component
@Primary
public class Cake implements Dessert {
    private String name = "cake";
    public void eat() {
        System.out.println("she eat " + name);
    }
}
