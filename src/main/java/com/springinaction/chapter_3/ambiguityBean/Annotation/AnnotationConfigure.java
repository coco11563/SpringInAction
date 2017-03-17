package com.springinaction.chapter_3.ambiguityBean.Annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sha0w on 17-3-17.
 */@Configuration
@ComponentScan(basePackages = "com.springinaction.chapter_3.ambiguityBean.Annotation.Dessert")
public class AnnotationConfigure {
}
