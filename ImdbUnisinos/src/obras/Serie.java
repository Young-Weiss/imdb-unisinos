package obras;

import java.util.List;

import pessoas.Ator;
import pessoas.Diretor;

public class Serie extends Obra {
    private int temporada;

    public Serie(String titulo, int duracaoMinutos, int anoLancamento, Diretor diretor, List<Ator> atores, int temporada) {
        super(titulo, duracaoMinutos, anoLancamento, diretor, atores);
        this.temporada = temporada;
    }

    public int getTemporada() {
        return temporada;
    }
}
