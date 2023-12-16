package test;

import org.junit.Assert;
import org.junit.Test;

import service.ContratoService;
import service.IContratoService;
import dao.*;

public class BuscarTestes {
	
	@Test
	public void buscarTesteDAO(){ //Teste unitário do buscarDao
		IContratoDAO contratoDao = new ContratoDAO();
		String retorno = contratoDao.buscar();
		Assert.assertEquals("e Objeto encontrado no DAO", retorno);
	}
	@Test
	public void testeBuscarService() { //Teste unitário do buscarService
	//IContratoDAO contratoDAO = new ContratoMOCK();
		IContratoDAO contratoDAO = new ContratoMOCK();
		IContratoService contratoService = new ContratoService(contratoDAO);
		String retorno = contratoService.buscar();
		
		Assert.assertEquals("Objeto encontrado no ContratoService", retorno); 
	}
	
	
	@Test
	public void testeBuscarServiceBuscarDao() { //Teste integrado de buscarService e buscarDAO
		IContratoDAO contratoDao = new ContratoDAO();
		IContratoService contratoService = new ContratoService(contratoDao);
		String retorno = contratoService.buscar();
		Assert.assertEquals("Objeto encontrado no ContratoService e Objeto encontrado no DAO", retorno);
	}
}


