package org.example.module_9_advanced_java.example_2;

@FunctionalInterface
public interface Greeting<T> {
    public abstract void greet(T name);
}
