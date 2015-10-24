package com.study.crawler.wrapper.lagou;

import com.study.crawler.wrapper.AbstractWrapper;
import com.study.crawler.wrapper.Params;
import com.study.crawler.wrapper.WrapperContext;

/**
 * Created by lijianzhong on 15/10/24.
 */
public class ListWrapper extends AbstractWrapper<JDModel> {


    public static interface ParamKeys {
        public static final String CITY = "city";
        public static final String PAGE_NUM = "pn";

    }


    @Override
    protected void complete(WrapperContext context, Params params) {

    }

    @Override
    protected JDModel parse(String content) {
        return null;
    }

    @Override
    protected String wrapper(WrapperContext context, Params params) {
        return null;
    }

    @Override
    protected void before(WrapperContext context, Params params) {

    }
}
