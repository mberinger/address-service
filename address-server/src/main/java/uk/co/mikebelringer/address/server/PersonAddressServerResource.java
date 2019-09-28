package uk.co.mikebelringer.address.server;

import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import uk.co.mikebelringer.person.client.PersonServiceClient;
import uk.co.mikebelringer.person.types.PersonWithDependencies;

public class PersonAddressServerResource extends ServerResource {

    ObjectMapper objectMapper = new ObjectMapper();
    PersonServiceClient personServiceClient = new PersonServiceClient();

    @Get
    public Representation getPersonAddress() throws JsonProcessingException {
        PersonWithDependencies personWithDependencies = personServiceClient.getPersonWithDependencies();
        PersonAddress PersonAddress = new PersonAddress(personWithDependencies, "Sunset Boulevard");
        return new StringRepresentation(objectMapper.writeValueAsString(PersonAddress));
    }
}
