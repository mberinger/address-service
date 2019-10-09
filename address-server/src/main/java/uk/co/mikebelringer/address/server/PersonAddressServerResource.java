package uk.co.mikebelringer.address.server;

import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import uk.co.mikebelringer.person.client.PersonServiceClient;
import uk.co.mikebelringer.person.types.PersonWithTitle;

public class PersonAddressServerResource extends ServerResource {

    ObjectMapper objectMapper = new ObjectMapper();
    PersonServiceClient personServiceClient = new PersonServiceClient();

    @Get
    public Representation getPersonAddress() throws JsonProcessingException {
        PersonWithTitle personWithTitle = personServiceClient.getPersonWithTitle();
        PersonAddress PersonAddress = new PersonAddress(personWithTitle, "Sunset Boulevard");
        return new StringRepresentation(objectMapper.writeValueAsString(PersonAddress));
    }
}
