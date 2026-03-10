package org.example.module_9_advanced_java.example_1;

// functional interface: if interface contain single abstract function it's called functional interface.
@FunctionalInterface
public interface MathOperation {
    public abstract int operation(int a, int b);
}
