package com.study.crawler.exception;

/**
 * Created by lijianzhong on 15/10/24.
 */
public class CrawlerException extends RuntimeException {

    /**
     *
     */
    public CrawlerException() {
    }

    /**
     * @param message
     */
    public CrawlerException(String message) {
        super(message);
    }

}
