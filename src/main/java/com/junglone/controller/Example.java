package com.junglone.controller;

import java.io.PrintStream;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Created by JungLone on 2017/3/4 11:45.
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
//    	Banner banner = new Banner() {
//			
//			@Override
//			public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
//				out.println("hello my-spring-boot!");
//			}
//		};

    	MyBanner mb = new MyBanner();
    	SpringApplication sa = new SpringApplication(Example.class);
    	sa.setBanner(mb);
//    	sa.setBannerMode(Banner.Mode.OFF);
    	
    	
    	sa.run(args);
//    	MyBean myBean = new MyBean();
//    	myBean.run(args);
    	
//    	MyApplication ma = new MyApplication();
//    	ma.run(sa);
    	
    }

}
