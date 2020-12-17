package io.github.chrfgod.clientes.rest.exception;

public class UsuarioCadastradoException extends RuntimeException {

    public UsuarioCadastradoException(String login){
        super("Usuario já cadastrado");
    }
}
