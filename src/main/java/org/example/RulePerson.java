package org.example;

import java.util.function.Predicate;

/**
 * @Author Kiarash Shamaei
 * @Since 2024-05-06
 * this part for test your rule engine
 *
 */

public enum RulePerson implements TestRule {
    AGE_GREATER_THAN_30(person -> person.getAge() > 10),
    NAME_STARTS_WITH_B(person -> person.getName().startsWith("B"));

    private final Predicate<Person> predicate;

    RulePerson(Predicate<Person> predicate) {
        this.predicate = predicate;
    }

    public Predicate<Person> getPredicate() {
        return predicate;
    }
}
