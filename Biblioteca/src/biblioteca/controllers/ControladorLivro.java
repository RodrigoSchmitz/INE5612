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
public class ControladorLivro {

    private Biblioteca biblioteca;

    public ControladorLivro(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    
    public String add(Livro livro) {
        livro.add(livro, this.biblioteca.getLivros());
        return "Livro adicionado com sucesso";
    }

    public Livro find(Livro livro) {
        return livro.find(livro.getCodigo(), this.biblioteca.getLivros());
    }

    public String update(Livro livro) {
        livro.update(livro, this.biblioteca.getLivros());
        return "Livro atualizado com sucesso";
    }

    public String remove(Livro livro) {
        livro.remove(livro, this.biblioteca.getLivros());
        return "Livro removido com sucesso";
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    
    public Livro instanciarLivro(int codLivro){
        Livro livro = new Livro();
        livro.setCodigo(codLivro);
        return livro;
    }

}
