package br.com.cursos.modelo;

public class Aula implements Comparable<Aula>{

    private String aulaTitulo;
    private int tempo;

    public Aula(String aulaTitulo, int tempo){
        this.aulaTitulo = aulaTitulo;
        this.tempo = tempo;
    }

    public String getAulaTitulo() {
        return aulaTitulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return  "Aula:"+this.aulaTitulo +  " Duração:"+ this.tempo + "min";
    }

    @Override
    public int compareTo(Aula outraAula) {
        //Recursividade(chamando a função no seu proprio escopo local)
        return aulaTitulo.compareTo(outraAula.aulaTitulo);
    }
}
