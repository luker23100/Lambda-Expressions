package com.dev.App;

@FunctionalInterface
public interface Manager2<T, R> {
	R start(T t);
}
