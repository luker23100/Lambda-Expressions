package com.dev.App;

@FunctionalInterface
public interface Validator {
	boolean validate(int a, int b, int c);
}
