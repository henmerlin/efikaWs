package dao;

import entidades.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public class AutenticacaoDAO implements AutenticacaoDAOInter{

    private EntityManager entityManager = FactoryEntityManager.getInstance();

    public Usuario consultar(String login) throws Exception {
        try {
            Query query = this.entityManager.createQuery("FROM Usuario u WHERE u.login =:param1");
            query.setParameter("param1", login);
            return (Usuario) query.getSingleResult();
        } catch (NoResultException e) {
            throw new Exception("Usuário não existe");
        }
    }

}
