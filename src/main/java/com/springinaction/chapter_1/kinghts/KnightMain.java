package com.springinaction.chapter_1.kinghts;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sha0w on 17-3-15.
 * try to use xml and annotation to set up the bean
 */
public class KnightMain {
    public static void main(String args[]) {

    }
    @Test
    public void testXML(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("xmlPath/knights.xml");
        Knight knight = classPathXmlApplicationContext.getBean(Knight.class);
        knight.embarkOnQuest();
        classPathXmlApplicationContext.close();
    }

    @Test
    public void testAnnotation(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = annotationConfigApplicationContext.getBean(Knight.class);
        knight.embarkOnQuest();
        annotationConfigApplicationContext.close();
    }
}
