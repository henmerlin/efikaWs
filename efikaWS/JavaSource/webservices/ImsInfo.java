package webservices;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import model.ImsServico;


@WebService(serviceName = "ImsInfo", portName="80")
public class ImsInfo {

	@EJB
	private ImsServico service;

	@WebMethod(operationName = "getConfigIms")
	public entidades.ImsInfo autenticarUsuario(@WebParam(name = "cidade") String cidade){

		try {
			return this.service.getConfigIms(cidade);
		} catch (Exception e) {
			return null;
		}	
	}

}
