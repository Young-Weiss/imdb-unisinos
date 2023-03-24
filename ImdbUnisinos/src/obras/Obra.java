package obras;

import java.util.List;

import pessoas.Ator;
import pessoas.Diretor;

public class Obra {
    private String titulo;
    private int duracaoMinutos;
    private int anoLancamento;
    private Diretor diretor;
    private List<Ator> atores;

    public Obra(String titulo, int duracaoMinutos, int anoLancamento, Diretor diretor, List<Ator> atores) {
        this.titulo = titulo;
        this.duracaoMinutos = duracaoMinutos;
        this.anoLancamento = anoLancamento;
        this.diretor = diretor;
        this.atores = atores;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public List<Ator> getAtores() {
        return atores;
    }
}
