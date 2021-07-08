package com.dev.App;

@FunctionalInterface
public interface TextUtils<T> {
	String perform(T text) throws TooLongException;
}
