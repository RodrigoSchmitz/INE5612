/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.controllers;

import biblioteca.entitys.Biblioteca;
import biblioteca.entitys.Emprestimo;
import biblioteca.entitys.Livro;
import biblioteca.entitys.Usuario;
import biblioteca.exceptions.EmprestimoNaoEncontradoException;
import biblioteca.exceptions.LivroNaoEncontradoException;
import java.util.Date;

/**
 * Classe <b>ControladorEmprestimo</b>
 * 
 * Essa Classe ...
 * 
 * @author Felipe Di Bernardi S Thiago
 */
public class ControladorEmprestimo {

    private Biblioteca biblioteca;

    public ControladorEmprestimo(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public String emprestar(Livro livro, Usuario usuario) {
        try {
            Emprestimo emprestimo = new Emprestimo(usuario, livro, new Date());
            emprestimo.emprestar(this.biblioteca, emprestimo);
            return "Livro emprestado com sucesso";
        } catch (LivroNaoEncontradoException e) {
            return e.getMessage();
        }
        
    }
    
    public String devolver(Emprestimo emprestimo) throws EmprestimoNaoEncontradoException {
        try {
            emprestimo.devolver(this.biblioteca, emprestimo);
            return "Livro devolvido com sucesso";
        } catch (EmprestimoNaoEncontradoException e) {
            return e.getMessage();
        }
    }
    
}
