package com.tianmaying.crawler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tianmaying.crawler.impl.MultiCrawlerWithJpa;

@Component
public class UpdateSchedule {
    
    @Autowired
    private MultiCrawlerWithJpa multiCrawler;
    
    public void update() {
    }

}
