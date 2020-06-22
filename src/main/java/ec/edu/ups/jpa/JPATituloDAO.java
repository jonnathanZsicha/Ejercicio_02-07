package ec.edu.ups.jpa;

import java.util.List;

import ec.edu.ups.dao.TituloDAO;
import ec.edu.ups.modelo.Titulo;



public class JPATituloDAO extends JPAGenericDAO<Titulo, Integer> implements TituloDAO{
	

	public JPATituloDAO() {
		super(Titulo.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Titulo> read() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
