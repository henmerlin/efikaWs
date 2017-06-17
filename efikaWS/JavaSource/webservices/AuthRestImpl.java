package webservices;

import entidades.Usuario;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.AuthInterface;
import model.FactoryServico;
import model.UsuarioAdapter;
import model.UsuarioDTO;

/**
 *
 * @author G0034481
 */
@Path("/autentica")
public class AuthRestImpl {

    private AuthInterface as;

    @GET
    @Path("/consultar/{login}")
    @Produces(MediaType.APPLICATION_JSON)
    public UsuarioDTO consultar(@PathParam("login") String login) {
        try {
            this.as = FactoryServico.createAutenticacaoServico();
            return UsuarioAdapter.adapter(as.consultar(login));
        } catch (Exception ex) {
            //ex.printStackTrace();
            return new UsuarioDTO();
        }
    }
    
    @POST
    @Path("/verificarCredencial")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Boolean verificarCredencial(Usuario u) {
        try {            
            this.as = FactoryServico.createAutenticacaoServico();
            Boolean result = this.as.verificarCredencial(u.getLogin(), u.getSenha());            
            return result;
        } catch (Exception e) {
            return false;
        }
    }

}
