package com.exsun.mvvmrxjavademo;

/**
 * Created by 肖坤 on 2017/9/25.
 * company：exsun
 * email：838494268@qq.com
 */

public class GankHttpResponse<T>
{
    private boolean error;
    private T results;

    public T getResults()
    {
        return results;
    }

    public void setResults(T results)
    {
        this.results = results;
    }

    public boolean getError()
    {
        return error;
    }

    public void setError(boolean error)
    {
        this.error = error;
    }
}
