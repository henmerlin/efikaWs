package webservices;

import entidades.Usuario;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.AuthInterface;
import model.FactoryServico;

/**
 *
 * @author G0034481
 */
@Path("/autentica")
public class ClienteController {

    private AuthInterface as;

    @GET
    @Path("/{login}")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario consultar(@PathParam("login") String login) {
        try {
            as = FactoryServico.createAutenticacaoServico();
            return as.consultar(login);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new Usuario();
        }
    }
}
