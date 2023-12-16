package dao;



public class ContratoDAO implements IContratoDAO {
	
	
	@Override
	public void salvar() {
		throw new UnsupportedOperationException("Não funciona o banco");
		
	}

	@Override
	public String buscar() {
		
		return "e Objeto encontrado no DAO";
	}

	@Override
	public String excluir() {
		// TODO Auto-generated method stub
		return "Objeto excluido no DAO";
	}

	@Override
	public String atualizar() {
		// TODO Auto-generated method stub
		return "Objeto atualizado no DAO";
	}




	
}
