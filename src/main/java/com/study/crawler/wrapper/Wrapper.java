/**
 *
 */
package com.study.crawler.wrapper;
import com.study.crawler.exception.CrawlerException;

/**
 * @author lijianzhong
 *
 */
public interface Wrapper<T> {

    public T fetch(WrapperContext context, Params params) throws CrawlerException;

}
