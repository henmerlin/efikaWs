package webservices;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;

import entidades.Usuario;
import model.AutenticacaoServico;


@javax.jws.WebService(serviceName = "EfikaUsers")
public class EfikaUsers {

	@EJB
	private AutenticacaoServico service;

	@WebMethod(operationName = "autenticarUsuario")
	public Boolean autenticarUsuario(@WebParam(name = "login") String login, @WebParam(name = "senha") String senha){

		try {
			this.service.consultarUsuarioSenha(login, senha);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}	
	}

	@WebMethod(operationName = "consultarUsuario")
	public Usuario consultarUsuario(@WebParam(name = "login") String login){
		
		try {
			return this.service.consultarUsuario(login);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}		
}
