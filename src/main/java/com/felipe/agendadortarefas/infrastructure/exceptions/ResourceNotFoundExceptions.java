package com.felipe.agendadortarefas.infrastructure.exceptions;

public class ResourceNotFoundExceptions extends  RuntimeException{
    public ResourceNotFoundExceptions(String mensagem){
        super(mensagem);
    }
    public ResourceNotFoundExceptions(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }
}
