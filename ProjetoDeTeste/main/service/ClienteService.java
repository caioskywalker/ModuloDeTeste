package service;

import dao.ClienteDAO;
import dao.ClienteDaoMOCK;
import dao.IclientDAO;

public class ClienteService {
	
	private IclientDAO clienteDao; //Implementa a interface IclientDAO ao invés do ClienteDAO diretamente.
	
	public ClienteService(IclientDAO clienteDao) { //Recebe a interface ao invés do ClienteDAO ou ClienteDaoMOCK
		//clienteDao = new ClienteDAO();
		//clienteDao = new ClienteDaoMOCK();
		this.clienteDao = clienteDao;
	}
	
	public String salvar() {
		clienteDao.salvar();
		return "Sucesso";
	}

}
