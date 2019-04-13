package com.example.usecases;

public interface IPresenterCallBack<R> {

    void onSuccess(R valueToReturn);

    void onError(Throwable throwable);
}
