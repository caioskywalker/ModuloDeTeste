package test;

import org.junit.Assert;
import org.junit.Test;

import dao.ContratoDAO;
import dao.ContratoMOCK;
import dao.IContratoDAO;
import service.ContratoService;
import service.IContratoService;

public class ExcluirTestes {
	
	@Test
	public void excluirDAOteste() {
		IContratoDAO contratoDAO = new ContratoDAO();
		String r = contratoDAO.excluir();
		Assert.assertEquals("Objeto excluido no DAO", r);
		
	}
	
	@Test
	public void excluirServiceTeste() {
		IContratoDAO contratoDAO = new ContratoMOCK();
		IContratoService contratoService = new ContratoService(contratoDAO);
		String r = contratoService.excluir();
		Assert.assertEquals("Objeto excluido no ContratoService e " + null, r); //o MOCK retorna null
		
		
	}
	@Test
	public void testeIntegradoExcluir() {
		
		IContratoDAO contratoDAO = new ContratoDAO();
		IContratoService contratoService = new ContratoService(contratoDAO);
		String r = contratoService.excluir();
	Assert.assertEquals("Objeto excluido no ContratoService e Objeto excluido no DAO", r);
		
	}

}
