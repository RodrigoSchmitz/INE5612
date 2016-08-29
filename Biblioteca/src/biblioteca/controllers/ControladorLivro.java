/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.controllers;

import biblioteca.entitys.Biblioteca;
import biblioteca.entitys.Livro;

/**
 * Classe <b>ControladorLivro</b>
 * 
 * Essa Classe ...
 * 
 * @author Felipe Di Bernardi S Thiago
 */
public class ControladorLivro implements Controlavel<Livro> {

    private Biblioteca biblioteca;

    public ControladorLivro(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    
    @Override
    public Livro add(Livro t) {
        if (!this.biblioteca.getLivros().isEmpty()) {
            t.setCodigo(this.biblioteca.getLivros().get(this.biblioteca.getLivros().size() - 1).getCodigo() + 1);
        } else {
            t.setCodigo(1);
        }
        this.biblioteca.getLivros().add(t);
        return t;
    }

    @Override
    public Livro find(Integer codigo) {
        for (Livro livro : this.biblioteca.getLivros()) {
            if (livro.getCodigo().equals(codigo)) {
                return livro;
            }
        }
        return null;
    }

    @Override
    public Livro update(Livro t) {
        Livro livroOld = this.find(t.getCodigo());
        if (livroOld != null) {
            this.biblioteca.getLivros().set(this.biblioteca.getLivros().indexOf(livroOld), t);
        } else {
            this.add(t);
        }
        return t;
    }

    @Override
    public Livro remove(Livro t) {
        Livro livroRemovido = this.find(t.getCodigo());
        if (livroRemovido != null) {
            this.biblioteca.getLivros().remove(livroRemovido);
            return livroRemovido;
        }
        return null;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

}
