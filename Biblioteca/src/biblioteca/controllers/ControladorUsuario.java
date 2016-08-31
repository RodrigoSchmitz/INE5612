/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.controllers;

import biblioteca.entitys.Biblioteca;
import biblioteca.entitys.Usuario;

/**
 * Classe <b>ControladorUsuario</b>
 * 
 * Essa Classe ...
 * 
 * @author Felipe Di Bernardi S Thiago
 */
public class ControladorUsuario {

    private Biblioteca biblioteca;
    
    public ControladorUsuario(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    
    public String add(Usuario usuario) {
        usuario.add(usuario, this.biblioteca.getUsuarios());
        return "Usuario adicionado com sucesso.";
    }

    public Usuario find(Usuario usuario) {
        return usuario.find(usuario.getCodigo(), this.biblioteca.getUsuarios());
    }

    public String update(Usuario usuario) {
        usuario.update(usuario, this.biblioteca.getUsuarios());
        return "Usuario atualizado com sucesso.";
    }

    public String remove(Usuario usuario) {
        usuario.remove(usuario, this.biblioteca.getUsuarios());
        return "Usuario removido com sucesso.";
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

}
