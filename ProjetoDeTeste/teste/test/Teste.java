package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dao.ClienteDAO;
import dao.ClienteDaoMOCK;
import dao.IclientDAO;
import service.ClienteService;


public class Teste {
	@Test
	public void salvarTesteMOCK() {
		
		IclientDAO mockDao = new ClienteDaoMOCK(); //Instanciamos o mock
		ClienteService clienteService = new ClienteService(mockDao);
		//E passamos o mock dentro do construtor do ClienteService, agora decidimos qual implementação utilizaremos, se é o Mock ou ClienteDao
		//diretamnete no código do teste
		String s = clienteService.salvar();
		assertEquals("Sucesso", s);
		
		
	}
	
	@Test(expected = UnsupportedOperationException.class) // Aqui colocamos o erro que nós esperamos, o mesmo que colocamos no ClienteDAO salvar()
	public void esperadoExceptionErroClienteDao() {//o erro esperado em expected sinalizará check verde no resultado do JUnit
		
		IclientDAO clienteDAO = new ClienteDAO(); //Instanciamos o mock
		ClienteService clienteService = new ClienteService(clienteDAO);
		//E passamos o mock dentro do construtor do ClienteService, agora decidimos qual implementação utilizaremos, se é o Mock ou ClienteDao
		//diretamnete no código do teste
		clienteService.salvar();
		//assertEquals("Sucesso", s);
		
		
	}

}
