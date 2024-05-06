package org.example;

import java.util.List;

/**
 * @Author Kiarash Shamaei
 * @Since 2024-05-06
 * this part for test your rule engine
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Person> people = List.of(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );

        RuleEngine<Person> ruleEngine = new RuleEngine<>();
        ruleEngine.addRule(RulePerson.AGE_GREATER_THAN_30);
        ruleEngine.addRule(RulePerson.NAME_STARTS_WITH_B);

        List<Person> filteredPeople = ruleEngine.filter(people);

        //this part only print result
        for (Person person : filteredPeople) {
            System.out.println(person.getName());
        }
    }
}
