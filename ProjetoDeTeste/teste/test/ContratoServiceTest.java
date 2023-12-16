package test;

import org.junit.Assert;
import org.junit.Test;

import dao.ContratoDAO;
import dao.ContratoMOCK;
import dao.IContratoDAO;
import service.ContratoService;
import service.IContratoService;


public class ContratoServiceTest {
	
	@Test
	public void salvarContratoTest() {
		IContratoDAO dao = new ContratoMOCK();
		IContratoService contratoService = new ContratoService(dao);
		String retorno = contratoService.salvar();
		Assert.assertEquals("Sucesso", retorno);
		
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroSalvarBancoDeDados() {
		IContratoDAO novoContratoDao = new ContratoDAO();
		IContratoService contratoService = new ContratoService(novoContratoDao);
		

		
	}

}
