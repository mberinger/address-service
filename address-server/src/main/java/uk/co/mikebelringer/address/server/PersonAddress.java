package uk.co.mikebelringer.address.server;

import uk.co.mikebelringer.person.types.Person;

public class PersonAddress {
    private Person person;
    private String streetName;

    public PersonAddress(Person person, String streetName) {
        this.person = person;
        this.streetName = streetName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
