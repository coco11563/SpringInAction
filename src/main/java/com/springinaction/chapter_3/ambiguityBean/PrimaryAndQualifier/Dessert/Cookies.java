package com.springinaction.chapter_3.ambiguityBean.PrimaryAndQualifier.Dessert;

import org.springframework.stereotype.Component;

/**
 * Created by sha0w on 17-3-17.
 *
 */
@Component
public class Cookies implements Dessert {
    private String name = "cookies";
    public void eat() {
        System.out.println("she eat " + name);
    }
}
