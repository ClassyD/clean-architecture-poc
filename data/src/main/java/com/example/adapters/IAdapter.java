package com.example.adapters;

public interface IAdapter<T, R> {
    R Adapt(T entity);
}
