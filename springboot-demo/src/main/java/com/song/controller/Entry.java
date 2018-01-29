package com.song.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by 600601 on 2018/1/29.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.song")
public class Entry {
    public static void main(String[] args)throws Exception{
        SpringApplication.run(Entry.class,args);
    }
}
