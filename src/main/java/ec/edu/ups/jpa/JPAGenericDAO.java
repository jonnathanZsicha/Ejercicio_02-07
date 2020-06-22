package ec.edu.ups.jpa;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.mysql.cj.Query;

import ec.edu.ups.dao.GenericDAO;





public class JPAGenericDAO <T,ID> implements GenericDAO <T,ID>{

	 private Class<T> persistentClass;
	 protected EntityManager em;

	    public JPAGenericDAO(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
		this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
		
	    }
	    
	@Override
	public void create(T entity) {
		// TODO Auto-generated method stub
		try {
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(">>>EROR : JPAGenericDAO :create " + e);
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
		
	}

	@Override
	public T read(ID id) {
		// TODO Auto-generated method stub
		return em.find(persistentClass, id);
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
	
		try {
			em.merge(entity);
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
		    System.out.println(">>>> ERROR:JPAGenericDAO:update " + e);
		    if (em.getTransaction().isActive())
			em.getTransaction().rollback();
		    
		}
		
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		try {
		    em.remove(entity);
		    em.getTransaction().commit();
		} catch (Exception e) {
		    System.out.println(">>>> ERROR:JPAGenericDAO:delete " + e);
		    if (em.getTransaction().isActive())
			em.getTransaction().rollback();
		}
		
	}


	@Override
	public List<T> read() {
		// TODO Auto-generated method stub
		return null;
	}



}
