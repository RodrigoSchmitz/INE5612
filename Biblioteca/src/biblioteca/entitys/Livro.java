/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.entitys;

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
    
}