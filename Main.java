import br.com.cursos.modelo.Aluno;
import br.com.cursos.modelo.Aula;
import br.com.cursos.modelo.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Main{
    public static void main(String[] args){

        Curso curso1 = new Curso("Introdução ao Java", "Paulo silveira");
        curso1.adicionaAula(new Aula("O que é JRE, JDK e JVM?", 20));
        curso1.adicionaAula(new Aula("Instalando a IDE", 15));
        curso1.adicionaAula(new Aula("Compilando nosso primeiro Programa", 18));
        curso1.adicionaAula(new Aula("Tipos primitivos", 13));
        curso1.adicionaAula(new Aula("Operações matemáticas", 10));

        System.out.println(curso1);
        Aluno a1 = new Aluno("Messias", 3695193);
        Aluno a2 = new Aluno("Fabiano", 2378999);
        Aluno a3 = new Aluno("Iara",2331212);
        Aluno a4 = new Aluno("Gonçalo", 2881255);
        Aluno a5 = new Aluno("Roberto", 9875211);


        Aluno messias = new Aluno("Messias", 3695193);

        curso1.matricularNoCurso(a2);
        curso1.matricularNoCurso(a3);
        curso1.matricularNoCurso(a4);
        curso1.matricularNoCurso(a5);

        //System.out.println(a1 == messias);//Mesmos valores, referência/Objetos diferentes
        System.out.println(a1.equals(messias));
    }
}