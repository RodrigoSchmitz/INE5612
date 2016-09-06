/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.entitys;

import java.util.List;

/**
 * Classe <b>Livro</b>
 * 
 * Essa Classe representa uma entidade Livro no sistema.
 * 
 * @author Felipe Di Bernardi S Thiago
 */
public class Livro {
    
    private String nome;
    
    private Integer codigo;
    
    private boolean emprestado;

    public Livro add(Livro livro, List<Livro> livros) {
        if (!livros.isEmpty()) {
            livro.setCodigo(livros.get(livros.size() - 1).getCodigo() + 1);
        } else {
            livro.setCodigo(1);
        }
        livros.add(livro);
        return livro;
    }
    
    public Livro find(Integer codigo, List<Livro> livros) {
        for (Livro livro : livros) {
            if (livro.getCodigo().equals(codigo)) {
                return livro;
            }
        }
        return null;
    }
    
    public Livro update(Livro livro, List<Livro> livros) {
        Livro livroOld = this.find(livro.getCodigo(), livros);
        if (livroOld != null) {
            livros.set(livros.indexOf(livroOld), livro);
        } else {
            this.add(livro, livros);
        }
        return livro;
    }
    
    public Livro remove(Livro livro, List<Livro> livros) {
        Livro livroRemovido = this.find(livro.getCodigo(), livros);
        if (livroRemovido != null) {
            livros.remove(livroRemovido);
            return livroRemovido;
        }
        return null;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return this.codigo + " - " + this.nome;
    }
    
}
