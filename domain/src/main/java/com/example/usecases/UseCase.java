package com.example.usecases;

/**
 * Interface every use case has to extend this class
 * UseCase acts like a bridge to the data layer
 */

public interface UseCase<R> {

    void setRepository(IRepository repository);

    void setPresenterCallback(IPresenterCallBack<R> callback);

}
