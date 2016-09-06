/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.entitys;

import biblioteca.exceptions.CpfCadastradoException;
import biblioteca.exceptions.UsuarioVazioException;
import java.util.List;

/**
 * Classe <b>Usuario</b>
 * 
 * Essa Classe representa uma entidade Usuario no sistema.
 * 
 * @author Felipe Di Bernardi S Thiago
 */
public class Usuario {

    private String nome;
    
    private Integer codigo;
    
    private String cpf;

    public Usuario add(Usuario usuario, List<Usuario> usuarios) throws UsuarioVazioException, CpfCadastradoException {
        if ((usuario.getCpf() != null && !("").equals(usuario.getCpf()))
                && (usuario.getNome() != null && !("").equals(usuario.getNome()))) {
            if (!usuarios.isEmpty()) {
                if (checkCPF(usuario, usuarios)) {
                    throw new CpfCadastradoException("CPF já cadastrado");
                }
                usuario.setCodigo(usuarios.get(usuarios.size() - 1).getCodigo() + 1);
            } else {
                usuario.setCodigo(1);
            }
            usuarios.add(usuario);
            return usuario;
        } else {
            throw new UsuarioVazioException("Usuario com campos vazios.");
        }
        
    }
    
    public Usuario find(Integer codigo, List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCodigo().equals(codigo)) {
                return usuario;
            }
        }
        return null;
    }
    
    public Usuario update(Usuario usuario, List<Usuario> usuarios) {
        Usuario usuarioOld = this.find(usuario.getCodigo(), usuarios);
        if (usuarioOld != null) {
            usuarios.set(usuarios.indexOf(usuarioOld), usuario);
        } else {
            this.add(usuario, usuarios);
        }
        return usuario;
    }
    
    public Usuario remove(Usuario usuario, List<Usuario> usuarios) {
        Usuario usuarioRemovido = this.find(usuario.getCodigo(), usuarios);
        if (usuarioRemovido != null) {
            usuarios.remove(usuarioRemovido);
            return usuarioRemovido;
        } else {
            return null;
        }
    }
    
    public boolean checkCPF(Usuario usuario, List<Usuario> usuarios) {
        for (Usuario u : usuarios) {
            if (usuario.getCpf().equals(u.getCpf())) {
                return true;
            }
        }
        return false;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return this.codigo + " - " + this.nome;
    }
    
}
