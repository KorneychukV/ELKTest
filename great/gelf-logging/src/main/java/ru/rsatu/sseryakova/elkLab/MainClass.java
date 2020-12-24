package ru.rsatu.sseryakova.elkLab;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.logging.Logger;


@Path("/log")
public class MainClass {
	private static final Logger LOG = Logger.getLogger(MainClass.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String log() {
	    LOG.info("Log message from app");
        return "Return message from app";
    }
}
