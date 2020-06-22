package ec.edu.ups.jpa;



import ec.edu.ups.dao.DocenteDAO;
import ec.edu.ups.modelo.Docente;



public class JPADocenteDAO extends JPAGenericDAO<Docente, Integer> implements DocenteDAO{
	

	public JPADocenteDAO() {
		super(Docente.class);
		// TODO Auto-generated constructor stub
	}

	
}
