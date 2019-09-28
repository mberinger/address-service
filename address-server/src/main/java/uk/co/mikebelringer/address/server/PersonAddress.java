package uk.co.mikebelringer.address.server;

import uk.co.mikebelringer.person.types.PersonWithDependencies;

public class PersonAddress {
    private PersonWithDependencies person;
    private String streetName;

    public PersonAddress(PersonWithDependencies person, String streetName) {
        this.person = person;
        this.streetName = streetName;
    }

    public PersonWithDependencies getPerson() {
        return person;
    }

    public void setPerson(PersonWithDependencies person) {
        this.person = person;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
