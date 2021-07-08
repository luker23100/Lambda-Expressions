package com.dev.App;

@FunctionalInterface
public interface Manager<T> {
	T start(T t);
}
