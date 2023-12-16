package test;

import org.junit.Assert;
import org.junit.Test;

import dao.ContratoDAO;
import dao.ContratoMOCK;
import dao.IContratoDAO;
import service.ContratoService;
import service.IContratoService;

public class AtualizarTestes {
	
	@Test
	public void atualizarTesteDAO(){ //Teste unitário do buscarDao
		IContratoDAO contratoDao = new ContratoDAO();
		String retorno = contratoDao.atualizar();
		Assert.assertEquals("Objeto atualizado no DAO", retorno);
	}
	@Test
	public void atualizarBuscarService() { //Teste unitário do buscarService
	//IContratoDAO contratoDAO = new ContratoMOCK();
		IContratoDAO contratoDAO = new ContratoMOCK();
		IContratoService contratoService = new ContratoService(contratoDAO);
		String retorno = contratoService.atualizar();
		
		Assert.assertEquals("Objeto atualizado no ContratoService e " + null, retorno); //ContratoMOCK quando implementado como metodo que retorna string, ele retorna null
	}
	
	
	@Test
	public void testeAtualizarServiceBuscarDao() { //Teste integrado de buscarService e buscarDAO
		IContratoDAO contratoDao = new ContratoDAO();
		IContratoService contratoService = new ContratoService(contratoDao);
		String retorno = contratoService.atualizar();
		Assert.assertEquals("Objeto atualizado no ContratoService e Objeto atualizado no DAO", retorno);
	}

}
