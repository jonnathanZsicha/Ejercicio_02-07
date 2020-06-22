package ec.edu.ups.jpa;

import java.util.List;

import ec.edu.ups.dao.ReciboPagoDAO;
import ec.edu.ups.modelo.pagos.ReciboDePago;



public class JPAReciboPagoDAO extends JPAGenericDAO<ReciboDePago, Integer> implements ReciboPagoDAO{
	

	public JPAReciboPagoDAO() {
		super(ReciboDePago.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ReciboDePago> read() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
