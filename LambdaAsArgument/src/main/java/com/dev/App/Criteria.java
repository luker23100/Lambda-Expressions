package com.dev.App;

@FunctionalInterface
public interface Criteria {
	boolean matches(House house);
}
