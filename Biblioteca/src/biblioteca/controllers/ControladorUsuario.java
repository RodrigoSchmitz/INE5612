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
public class ControladorUsuario implements Controlavel<Usuario> {

    private Biblioteca biblioteca;

    public ControladorUsuario(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    
    @Override
    public Usuario add(Usuario t) {
        if (!biblioteca.getUsuario().isEmpty()) {
            t.setCodigo(this.biblioteca.getUsuario().get(this.biblioteca.getUsuario().size() - 1).getCodigo() + 1);
        } else {
            t.setCodigo(1);
        }
        this.biblioteca.getUsuario().add(t);
        return t;
    }

    @Override
    public Usuario find(Integer codigo) {
        for (Usuario usuario : this.biblioteca.getUsuario()) {
            if (usuario.getCodigo().equals(codigo)) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public Usuario update(Usuario t) {
        Usuario usuarioOld = this.find(t.getCodigo());
        if (usuarioOld != null) {
            this.biblioteca.getUsuario().set(this.biblioteca.getUsuario().indexOf(usuarioOld), t);
        } else {
            this.add(t);
        }
        return t;
    }

    @Override
    public Usuario remove(Usuario t) {
        Usuario usuarioRemovido = this.find(t.getCodigo());
        if (usuarioRemovido != null) {
            this.biblioteca.getUsuario().remove(usuarioRemovido);
            return usuarioRemovido;
        } else {
            return null;
        }
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

}
