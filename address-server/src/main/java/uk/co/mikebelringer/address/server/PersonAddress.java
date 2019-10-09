package uk.co.mikebelringer.address.server;

import uk.co.mikebelringer.person.types.PersonWithTitle;

public class PersonAddress {
    private PersonWithTitle person;
    private String streetName;

    public PersonAddress(PersonWithTitle person, String streetName) {
        this.person = person;
        this.streetName = streetName;
    }

    public PersonWithTitle getPerson() {
        return person;
    }

    public void setPerson(PersonWithTitle person) {
        this.person = person;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
