package com.springinaction.chapter_3.ambiguityBean.PrimaryAndQualifier;

import com.springinaction.chapter_3.ambiguityBean.PrimaryAndQualifier.Dessert.Dessert;
import com.springinaction.chapter_3.ambiguityBean.PrimaryAndQualifier.Dessert.IceCream;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sha0w on 17-3-17.
 */
@Configuration
@ComponentScan(basePackages = "com.springinaction.chapter_3.ambiguityBean.PrimaryAndQualifier.Dessert")
public class DessertConfigure {
    @Bean
    @Qualifier("cold")
    public Dessert getHerDessert() {
        return new IceCream();
    }
}
