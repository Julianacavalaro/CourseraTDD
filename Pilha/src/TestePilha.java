import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;
//Se o código está todo "verde" é porque compilou

class TestePilha {
	
	private Pilha p;
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@BeforeEach
	public void inicializaPilha() {
		p = new Pilha(10);
	}
	
	@Test
	public void pilhaVazia() {
		assertTrue(p.estaVazia());
		assertEquals(0,p.tamanho());
	}
	
	@Test
	public void empilhaUmElemento() {
		p.empilha("primeiro");
		assertFalse(p.estaVazia());
		assertEquals(1, p.tamanho());
		assertEquals("primeiro",p.topo());
	}
	
	@Test
	public void empilhaEDesempilha() {
		p.empilha("primeiro");
		p.empilha("segundo");
		assertFalse(p.estaVazia());
		assertEquals(2, p.tamanho());
		assertEquals("segundo",p.topo());
		Object desempilhado = p.desempilha();
		assertEquals(1, p.tamanho());
		assertEquals("primeiro",p.topo());
		assertEquals("segundo", desempilhado);
	}
	@Test //(expected = PilhaVaziaException.class)
	public void removeDaPilhaVazia() throws PilhaVaziaException{
		thrown.expect(PilhaVaziaException.class);
		//thrown.expectMessage("Exception Message");
		p.desempilha();
	}
	
		@Test
		public void adicionaNaPilhaCheia() throws PilhaCheiaException {
	//	thrown.expectMessage("Exception Message");
		for(int i=0; i<10; i++) {
			p.empilha("elemento "+i);
		}
		try {
			p.empilha("boom");
			fail();
		} catch (PilhaCheiaException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		}
	}
	/*	@Test
		public void adicionaNaPilhaCheia() throws PilhaCheiaException {
		for(int i=0; i<10; i++) {
			thrown.expect(PilhaCheiaException.class);
			p.empilha("elemento"+i);
		}
			p.empilha("boom");
	} */
	
//	@Test
	//void test() {
		//fail("Not yet implemented");
	//}

}
