/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.entitys;

import biblioteca.exceptions.EmprestimoNaoEncontradoException;
import biblioteca.exceptions.EmprestimoVazioException;
import biblioteca.exceptions.LivroEmprestadoException;
import java.util.Calendar;
import java.util.Date;

/**
 * Classe <b>Emprestimo</b>
 * 
 * Essa Classe representa uma entidade Emprestimo no sistema.
 * 
 * @author Felipe Di Bernardi S Thiago
 */
public class Emprestimo {

    private Usuario usuario;
    
    private Livro livro;
    
    private Date dataEmprestimo;
    
    private Date dataMaximaDevolucao;
    
    private Date dataDevolucao;

    public Emprestimo(Usuario usuario, Livro livro, Date dataEmprestimo) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        Calendar dataDevolucao = Calendar.getInstance();
        dataDevolucao.setTime(dataEmprestimo);
        dataDevolucao.add(Calendar.WEEK_OF_YEAR, 1);
        this.dataMaximaDevolucao = dataDevolucao.getTime();
    }
    
    public void emprestar(Biblioteca biblioteca, Emprestimo emprestimo) throws LivroEmprestadoException, EmprestimoVazioException {
        if (emprestimo.getLivro() == null || emprestimo.getUsuario() == null || emprestimo.getDataEmprestimo() == null) {
            throw new EmprestimoVazioException("Campos não preenchidos.");
        }
        if (!emprestimo.getLivro().isEmprestado()) {
            biblioteca.getEmprestimos().add(emprestimo);
            emprestimo.getLivro().setEmprestado(true);
        } else {
            throw new LivroEmprestadoException("Livro já emprestado");
        }
    }
    
    public void devolver(Biblioteca biblioteca, Emprestimo emprestimo, Date dataDevolucao) 
            throws EmprestimoNaoEncontradoException {
        if (biblioteca.getEmprestimos().contains(emprestimo)) {
            emprestimo.setDataDevolucao(dataDevolucao);
            emprestimo.getLivro().setEmprestado(false);
        } else {
            throw new EmprestimoNaoEncontradoException("Emprestimo não encontrado");
        }
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataMaximaDevolucao() {
        return dataMaximaDevolucao;
    }

    public void setDataMaximaDevolucao(Date dataMaximaDevolucao) {
        this.dataMaximaDevolucao = dataMaximaDevolucao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return this.livro.getNome();
    }
    
}
