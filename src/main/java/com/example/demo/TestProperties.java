package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;
import java.util.Set;

@Configuration
@ConfigurationProperties(prefix = "sso.test")
@PropertySource(value = "application.yml", ignoreResourceNotFound = false)
public class TestProperties {

    Set<Integer> numbers;
    Set<String> text;
    Set<String> bad;

    public void setBad(Set<String> bad) {
        this.bad = bad;
    }

    public void setNumbers(Set<Integer> numbers) {
        this.numbers = numbers;
    }

    public void setText(Set<String> text) {
        this.text = text;
    }

    @PostConstruct
    public void init(){
        System.out.println("post construct: " + text);
    }

}
