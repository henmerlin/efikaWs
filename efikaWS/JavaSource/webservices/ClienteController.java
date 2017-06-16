package webservices;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.AutenticacaoServico;

/**
 *
 * @author G0034481
 */
@Path("/autentica")
public class ClienteController {

    @EJB
    private AutenticacaoServico as;

    @GET
    @Path("/{login}")
    @Produces(MediaType.APPLICATION_JSON)
    public Boolean getCliente(@PathParam("login") String login) {
        try {
            return this.as.consultarUsuario(login) != null;
        } catch (Exception ex) {
            //ex.printStackTrace();
            return false;
        }
    }
}
