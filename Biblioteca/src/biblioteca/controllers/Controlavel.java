/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.controllers;

/**
 * Interface <b>Controlavel</b>
 * 
 * Essa Interface representa o comportamento de um Controlador.
 * 
 * @author Felipe Di Bernardi S Thiago
 * @param <T> Class generica ao qual a interface será atribuída em sua implementação.
 */
public interface Controlavel<T> {
    
    public T add(T t);
    
    public T find(Integer codigo);
    
    public T update(T t);
    
    public T remove(T t);
    
}
