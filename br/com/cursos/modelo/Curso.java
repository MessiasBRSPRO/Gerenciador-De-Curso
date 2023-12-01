package br.com.cursos.modelo;

import java.util.*;

public class Curso {

    private String nomeCurso;
    private String instrutor;
    private List<Aula> aulasDoCurso = new ArrayList<>();
    private Set<Aluno> alunosMatriculados = new HashSet<>();
    private Map<Integer, Aluno> pesquisarMatricula = new HashMap<>();

    public String getNomeCurso() {
        return nomeCurso;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulasDoCurso() {
        return Collections.unmodifiableList(aulasDoCurso);
    }

    public Curso(String nomeCurso, String instrutor){
        this.nomeCurso = nomeCurso;
        this.instrutor = instrutor;
    }

    public void adicionaAula(Aula aula){
        aulasDoCurso.add(aula);
    };

    public int exibirCargaHoraria(){
      return this.aulasDoCurso.stream().mapToInt(Aula :: getTempo).sum();
    }

    public void matricularNoCurso(Aluno aluno){
        this.alunosMatriculados.add(aluno);
        this.pesquisarMatricula.put(aluno.getMatriculaDoAluno(), aluno);
    }

    public Set<Aluno> getAlunosMatriculados() {
        return Collections.unmodifiableSet(alunosMatriculados);
    }

    public boolean buscarAluno(Aluno aluno){
        if(this.alunosMatriculados.contains(aluno)){
            System.out.println(aluno.getNomeAluno() + " Está matriculado no curso "
            + getNomeCurso());
            return true;
        }else{
            System.out.println("O aluno:"+aluno.getNomeAluno() + " não foi encontrado!");
            return false;
        }
    }

    public Aluno getMatriculado(int matricula ){
        return this.pesquisarMatricula.get(matricula);
    }

    @Override
    public String toString() {
        return "[Curso:" +getNomeCurso() + " ,Tempo em minutos:" +exibirCargaHoraria() +
                "\nAulas do curso:" + getAulasDoCurso() + "]";
    }
}
