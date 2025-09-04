package org.oma;

import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.api.RuleUnitData;
import org.oma.demo.Person;
public class PersonValidationService implements RuleUnitData {
    private DataStore<Person> persons = DataSource.createStore();

    public DataStore<Person> getPersons() {
        return persons;
    }
}
