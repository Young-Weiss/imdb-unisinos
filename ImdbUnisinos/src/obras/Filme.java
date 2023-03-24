package obras;

import java.util.List;

import pessoas.Ator;
import pessoas.Diretor;

public class Filme extends Obra {
    private String genero;

    public Filme(String titulo, int duracaoMinutos, int anoLancamento, Diretor diretor, List<Ator> atores, String genero) {
        super(titulo, duracaoMinutos, anoLancamento, diretor, atores);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

	public void setGenero(String genero) {
		this.genero = genero;
	}
}
