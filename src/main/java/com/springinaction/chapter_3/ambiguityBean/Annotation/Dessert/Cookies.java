package com.springinaction.chapter_3.ambiguityBean.Annotation.Dessert;

import com.springinaction.chapter_3.ambiguityBean.Annotation.Annotation.Fat;
import com.springinaction.chapter_3.ambiguityBean.Annotation.Annotation.Sweet;
import org.springframework.stereotype.Component;

/**
 * Created by sha0w on 17-3-17.
 *
 */
@Component
@Sweet
@Fat
public class Cookies implements Dessert {
    private String name = "cookies";
    public void eat() {
        System.out.println("she eat " + name);
    }
}
