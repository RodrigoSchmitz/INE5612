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

    public void emprestar(Livro livro, Usuario usuario) throws LivroNaoEncontradoException {
        if (this.biblioteca.getLivros().contains(livro)) {
            this.biblioteca.getEmprestimos().add(new Emprestimo(usuario, livro, new Date()));
            this.biblioteca.getLivros().remove(livro);
        } else {
            throw new LivroNaoEncontradoException("Livro não encontrado");
        }
    }
    
    public void devolver(Emprestimo emprestimo) throws EmprestimoNaoEncontradoException {
        if (this.biblioteca.getEmprestimos().contains(emprestimo)) {
            this.biblioteca.getEmprestimos().remove(emprestimo);
            this.biblioteca.getLivros().add(emprestimo.getLivro());
        } else {
            throw new EmprestimoNaoEncontradoException("Emprestimo não encontrado");
        }
    }
    
}
