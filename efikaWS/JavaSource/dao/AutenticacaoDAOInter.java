/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Usuario;

/**
 *
 * @author G0042204
 */
public interface AutenticacaoDAOInter {

    public Usuario consultar(String login) throws Exception;

}
