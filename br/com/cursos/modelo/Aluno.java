package br.com.cursos.modelo;

import br.com.cursos.exception.*;

import java.util.Objects;

public class Aluno {

    private String nomeAluno;
    private int matriculaDoAluno;

    public Aluno(String nomeAluno, int matriculaDoAluno){

        if(nomeAluno == null){
            throw new NullPointerException("Preencha o campo Obrigatório.");
        }
        this.nomeAluno = nomeAluno;
        if(String.valueOf(matriculaDoAluno).length() == 7){
            this.matriculaDoAluno = matriculaDoAluno;
        }else {
            throw new MatriculaInvalida("A matrícula deve conter "
            + "7 digitos!");
        }
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public int getMatriculaDoAluno() {
        return matriculaDoAluno;
    }

    @Override
    public boolean equals(Object outroAluno) {
        if (this == outroAluno) return true;
        if (outroAluno == null || getClass() != outroAluno.getClass()) return false;
        Aluno aluno = (Aluno) outroAluno;
        return this.nomeAluno.equals(aluno.nomeAluno);
    }

    @Override
    public int hashCode() {
        return this.nomeAluno.hashCode();
    }

    @Override
    public String toString() {
        return "[Aluno: " + getNomeAluno()+ ", Matrícula: " +getMatriculaDoAluno() + "]";
    }
}
