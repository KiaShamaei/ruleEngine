package org.example;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine<T> {
    private List<TestRule> rules;

    public RuleEngine() {
        this.rules = new ArrayList<>();
    }

    public void addRule(TestRule rule) {
        rules.add(rule);
    }

    public List<T> filter(List<T> items) {
        List<T> filteredItems = new ArrayList<>();
        for (T item : items) {
            if (rules.stream().allMatch(rule -> rule.getPredicate().test(item))) {
                filteredItems.add(item);
            }
        }
        return filteredItems;
    }
}


