package br.belmicro.api.teste;

import br.belmicro.api.teste.modelo.Produto;
import br.belmicro.api.teste.service.ProdutoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import javax.validation.ConstraintViolationException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ApiBelmicroTesteDevJrApplicationTests {

	@Autowired
	ProdutoService produtoService;
	@Test
	void testeProdutoCadastradoComSucesso() {

		//cenario
		Produto produtoTeste = new Produto();
		produtoTeste.setNome("headset hiperX Cloud Core");
		produtoTeste.setValor(650L);
		//acão
		produtoService.create(produtoTeste);
		// validacão
		assertEquals(produtoTeste.getId().toString().isEmpty(), false, "temos um id válido");
		assertEquals(produtoTeste.getNome(), "headset hiperX Cloud Core", "temos um nome válido");
	}

	//	@Test
//	public void testarCadastroProdutoComCamposFaltantes() {
//		final Produto produtoTeste = new Produto();
//		produtoTeste.setNome(null);
//
//		assertThrows(ConstraintViolationException.class, () -> produtoService.create(produtoTeste));
//
//	}

}
