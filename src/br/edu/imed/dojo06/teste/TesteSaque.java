package br.edu.imed.dojo06.teste;

import junit.framework.Assert;

import org.junit.Test;

import br.edu.imed.dojo06.caixa.Caixa;

public class TesteSaque {

	@Test
	public void testExisteClass() {
		Assert.assertNotNull(new TesteSaque());
	}
	@Test
	public void testExistCaixa(){
		Assert.assertNotNull(new Caixa());
	}
	
	@Test
	public void testExistAtributoQuantia(){
		Caixa caixa = new Caixa();
		Assert.assertNotNull(caixa.getQuantiaSacar());
	}
	@Test
	public void testAtribuicaoAtributoQuantiaSacar(){
		Caixa caixa= new Caixa();
		caixa.setQuantiaSacar(50);
		Assert.assertEquals(50, caixa.getQuantiaSacar());
		
	}
	
	@Test
	public void testNotasCemMaior(){
		Caixa caixa = new Caixa();
		caixa.setQuantiaSacar(2080);
		caixa.calculaNotasDeCem(caixa.getQuantiaSacar());
		Assert.assertEquals(20, caixa.getCem());
	}
	@Test
	public void testNotasCemMenor(){
		Caixa caixa = new Caixa();
		caixa.setQuantiaSacar(70);
		caixa.calculaNotasDeCem(caixa.getQuantiaSacar());
		Assert.assertEquals(0,caixa.getCem());
		
	}
	
	@Test
	public void testNotasCinquentaMaior(){
		Caixa caixa = new Caixa();
		caixa.setQuantiaSacar(2080);
		caixa.calculaNotasDeCinquenta(caixa.getQuantiaSacar());
		Assert.assertEquals(41, caixa.getCinquenta());
	}
	
	@Test
	public void testNotasCinquentaMenor(){
		Caixa caixa = new Caixa();
		caixa.setQuantiaSacar(35);
		caixa.calculaNotasDeCinquenta(caixa.getQuantiaSacar());
		Assert.assertEquals(0, caixa.getCinquenta());
	}
	
	@Test
	public void testNotasVinteMaior(){
		Caixa caixa = new Caixa();
		caixa.setQuantiaSacar(300);
		caixa.calculaNotasDeVinte(caixa.getQuantiaSacar());
		Assert.assertEquals(15, caixa.getVinte());
	}
	
	@Test
	public void testNotasVinteMenor(){
		Caixa caixa = new Caixa();
		caixa.setQuantiaSacar(15);
		caixa.calculaNotasDeVinte(caixa.getQuantiaSacar());
		Assert.assertEquals(0, caixa.getVinte());
	}
	
	@Test
	public void testNotasDezMaior(){
		Caixa caixa = new Caixa();
		caixa.setQuantiaSacar(300);
		caixa.calculaNotasDeDez(caixa.getQuantiaSacar());
		Assert.assertEquals(30, caixa.getDez());
	}
	
	@Test
	public void testNotasDezMenor(){
		Caixa caixa = new Caixa();
		caixa.setQuantiaSacar(5);
		caixa.calculaNotasDeDez(caixa.getQuantiaSacar());
		Assert.assertEquals(0, caixa.getDez());
		
	}
	@Test
	public void testSacar(){
		Caixa caixa= new Caixa();
		caixa.sacar(180);
		Assert.assertEquals(1, caixa.getCem());
		Assert.assertEquals(1, caixa.getCinquenta());
		Assert.assertEquals(1, caixa.getVinte());
		Assert.assertEquals(1, caixa.getDez());
	}

}
