package com.springinaction.chapter_3.ambiguityBean.Annotation.Dessert;

import com.springinaction.chapter_3.ambiguityBean.Annotation.Annotation.Fat;
import com.springinaction.chapter_3.ambiguityBean.Annotation.Annotation.Ice;
import com.springinaction.chapter_3.ambiguityBean.Annotation.Annotation.Sweet;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by sha0w on 17-3-17.
 */
@Component
@Sweet
@Fat
@Ice
public class IceCream implements Dessert {
    private String name = "iceCream";
    public void eat() {
        System.out.println("she eat " + name);
    }
}
