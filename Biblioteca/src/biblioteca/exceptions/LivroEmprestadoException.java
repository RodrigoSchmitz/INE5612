/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.exceptions;

/**
 * Classe <b>LivroNaoEncontradoException</b>
 * 
 * Essa Classe ...
 * 
 * @author Felipe Di Bernardi S Thiago
 */
public class LivroEmprestadoException extends RuntimeException {

    public LivroEmprestadoException(String message) {
        super(message);
    }

}
