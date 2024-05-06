package org.example;

import java.util.function.Predicate;

public interface TestRule {
    <T> Predicate<T> getPredicate();
}
