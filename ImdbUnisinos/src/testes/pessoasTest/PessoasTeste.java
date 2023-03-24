package testes.pessoasTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pessoas.Pessoa;
import pessoas.Diretor;
import pessoas.Ator;

class PessoasTeste {

	@Test
    public void testPessoa() {
        Pessoa pessoa = new Pessoa("João", 30);
        Assertions.assertEquals("João", pessoa.getNome());
        Assertions.assertEquals(30, pessoa.getIdade());
    }

    @Test
    public void testAtor() {
        Ator ator = new Ator("Arnold Schwarzenegger", 74);
        Assertions.assertEquals("Arnold Schwarzenegger", ator.getNome());
        Assertions.assertEquals(74, ator.getIdade());
    }

    @Test
    public void testDiretor() {
        Diretor diretor = new Diretor("James Cameron", 67);
        Assertions.assertEquals("James Cameron", diretor.getNome());
        Assertions.assertEquals(67, diretor.getIdade());
    }

}
