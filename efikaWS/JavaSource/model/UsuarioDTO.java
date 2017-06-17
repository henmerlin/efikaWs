/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author G0042204
 */
public class UsuarioDTO {
    
    private String login;

    private Integer nivel;

    public UsuarioDTO() {
    }

    public UsuarioDTO(String login, Integer nivel) {
        this.login = login;
        this.nivel = nivel;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

}
