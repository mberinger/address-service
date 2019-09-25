package uk.co.mikebelringer.address.server;

import org.restlet.Application;
import org.restlet.Component;
import org.restlet.Restlet;
import org.restlet.data.MediaType;
import org.restlet.data.Protocol;
import org.restlet.routing.Router;

import uk.co.mikebelringer.person.client.PersonServiceClient;

public class RestletServerApplication extends Application {

    public static void main(String[] args) throws Exception {
        Component c = new Component();
        c.getServers().add(Protocol.HTTP, 8183);
        c.getClients().add(Protocol.HTTP);
        c.getDefaultHost().attach(new RestletServerApplication());

        c.start();
    }

    @Override
    public Restlet createInboundRoot() {
        getMetadataService().setDefaultMediaType(MediaType.APPLICATION_ALL_JSON);

        Router router = new Router(getContext());
        router.attach("/address", PersonAddressServerResource.class);

        return router;
    }
}
