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
import biblioteca.exceptions.EmprestimoVazioException;
import biblioteca.exceptions.LivroEmprestadoException;
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

    public String emprestar(Livro livro, Usuario usuario, Date dataEmprestimo) {
        try {
            Emprestimo emprestimo = new Emprestimo(usuario, livro, dataEmprestimo);
            emprestimo.emprestar(this.biblioteca, emprestimo);
            return "Livro emprestado com sucesso";
        } catch (LivroEmprestadoException e) {
            return e.getMessage();
        } catch (EmprestimoVazioException e) {
            return e.getMessage();
        }
        
    }
    
    public String devolver(Emprestimo emprestimo, Date dataDevolucao, Float multa) throws EmprestimoNaoEncontradoException {
        try {
            emprestimo.devolver(this.biblioteca, emprestimo, dataDevolucao, multa);
            return "Livro devolvido com sucesso";
        } catch (EmprestimoNaoEncontradoException e) {
            return e.getMessage();
        }
    }    
}
