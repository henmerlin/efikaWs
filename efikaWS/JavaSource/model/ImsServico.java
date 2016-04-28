package model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entidades.ImsInfo;

@Stateless
public class ImsServico {

	@PersistenceContext(unitName="vu")
	private EntityManager entityManager;
	
	public ImsInfo getConfigIms(String cidade) throws Exception{

		try {
			Query query = this.entityManager.createQuery("FROM ImsInfo i WHERE i.cidade =:param1");
			query.setParameter("param1", cidade);
			return (ImsInfo) query.getSingleResult();
		} catch (NoResultException e) {
			throw new Exception("Cidade não encontrada!");
		}
	}

}
