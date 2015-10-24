package com.study.crawler.wrapper;

import com.study.crawler.exception.CrawlerException;

/**
 * Created by lijianzhong on 15/10/24.
 */
public abstract class AbstractWrapper<T> implements Wrapper<T> {

    @Override
    public T fetch(WrapperContext context, Params params) throws CrawlerException {
        try{
            this.before(context, params);
            String content = this.wrapper(context, params);
            T result = this.parse(content);
            return result;
        }finally{
            this.complete(context, params);
        }
    }

    protected abstract void complete(WrapperContext context, Params params);

    protected abstract T parse(String content);

    protected abstract String wrapper(WrapperContext context, Params params);

    protected abstract void before(WrapperContext context, Params params);


}
