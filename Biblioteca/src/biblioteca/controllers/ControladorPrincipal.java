/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.controllers;

import biblioteca.entitys.Biblioteca;

/**
 * Classe <b>ControladorPrincipal</b>
 * 
 * Essa Classe ...
 * 
 * @author Felipe Di Bernardi S Thiago
 */
public class ControladorPrincipal {

    private Biblioteca biblioteca;
    
    private ControladorUsuario ctrlUsuario;
    
    private ControladorLivro ctrlLivro;
    
    private ControladorEmprestimo ctrlEmprestimo;

    public ControladorPrincipal() {
        this.biblioteca = new Biblioteca();
        this.ctrlUsuario = new ControladorUsuario(biblioteca);
        this.ctrlLivro = new ControladorLivro(biblioteca);
        this.ctrlEmprestimo = new ControladorEmprestimo(biblioteca);
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public ControladorUsuario getCtrlUsuario() {
        return ctrlUsuario;
    }

    public void setCtrlUsuario(ControladorUsuario ctrlUsuario) {
        this.ctrlUsuario = ctrlUsuario;
    }

    public ControladorLivro getCtrlLivro() {
        return ctrlLivro;
    }

    public void setCtrlLivro(ControladorLivro ctrlLivro) {
        this.ctrlLivro = ctrlLivro;
    }

    public ControladorEmprestimo getCtrlEmprestimo() {
        return ctrlEmprestimo;
    }

    public void setCtrlEmprestimo(ControladorEmprestimo ctrlEmprestimo) {
        this.ctrlEmprestimo = ctrlEmprestimo;
    }
    
}
