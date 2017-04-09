package com.tianmaying.crawler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tianmaying.crawler.model.WebPage;
import com.tianmaying.crawler.model.WebPage.Status;

public interface WebPageRepository extends JpaRepository<WebPage, String> {

    WebPage findTopByStatus(Status status);
    
    long countByStatus(Status status);

}
