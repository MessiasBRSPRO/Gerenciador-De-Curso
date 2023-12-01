package br.com.cursos.exception;

public class MatriculaInvalida extends RuntimeException{
    public MatriculaInvalida(String msg){
        System.out.println(msg);
    }
}
