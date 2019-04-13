package com.example.usecases;

/**
 * Interface for a callback with generic type R
 * this will take the form of the object that needs to be returned
 */

public interface ICallback<R> {

    void onSuccess(R valueToReturn);

    void onError(Throwable throwable);

}
