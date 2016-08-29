/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.entitys;

import java.util.List;

/**
 * Classe <b>Biblioteca</b>
 * 
 * Essa Classe representa uma entidade Biblioteca no sistema.
 * 
 * @author Felipe Di Bernardi S Thiago
 */
public class Biblioteca {

    private List<Livro> livros;
    
    private List<Usuario> usuario;
    
    private List<Emprestimo> emprestimos;

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
    
}
