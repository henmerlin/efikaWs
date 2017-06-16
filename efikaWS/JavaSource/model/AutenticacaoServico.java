package model;

import dao.AutenticacaoDAOInter;
import dao.FactoryDAO;
import entidades.Usuario;
import javax.persistence.NoResultException;

public class AutenticacaoServico implements AuthInterface {

    private AutenticacaoDAOInter dao = FactoryDAO.createAutenticacaoDAO();

    @Override
    public Boolean verificarCredencial(String login, String senha) throws Exception {

        try {
            return dao.consultar(login).getSenha().equals(senha);
        } catch (NoResultException e) {
            throw new Exception("Usuário ou Senha incorretos!");
        }
    }

    @Override
    public Usuario consultar(String login) throws Exception {
        try {
            return dao.consultar(login);
        } catch (NoResultException e) {
            throw new Exception("Usuário não existe");
        }
    }

}
