package dao;

import entidades.Usuario;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public class AutenticacaoDAO extends AbstractHibernateDAO implements AutenticacaoDAOInter{

    @Override
    public Usuario consultar(String login) throws Exception {
        try {
            Query query = this.em.createQuery("FROM Usuario u WHERE u.login =:param1");
            query.setParameter("param1", login);
            return (Usuario) query.getSingleResult();
        } catch (NoResultException e) {
            throw new Exception("Usu�rio n�o existe");
        }
    }

}
