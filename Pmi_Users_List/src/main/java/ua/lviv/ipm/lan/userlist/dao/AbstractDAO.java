package ua.lviv.ipm.lan.userlist.dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ua.lviv.ipm.lan.userlist.domain.BaseEntity;


/**
 * 
 * abstract class AbstractDAO
 * 
 * @param <E>
 */
public abstract class AbstractDAO<E> extends BaseEntity implements AbstractDAOIface<E> {

	public static final String PERSISTENCE_UNIT_NAME = "PmiUsersList";
	@PersistenceContext(name = PERSISTENCE_UNIT_NAME)
	protected EntityManager entityManager;

	/**
	 * Find by Id
	 * 
	 * @param id
	 * @return
	 */
	public E findById(int id) {
		return entityManager.find(getEntityClass(), id);
	}

	/**
	 * Save entities
	 * 
	 * @param entities
	 */
	
	@SuppressWarnings("unchecked")
	public void save(E... entities) {

		for (E entity : entities) {
			
			entityManager.persist(entity);
			
			
		
		}
	}

	/**
	 * Remove entities
	 * 
	 * @param entities
	 */
	@SuppressWarnings("unchecked")
	public void remove(E... entities) {
		for (E entity : entities) {
			entityManager.remove(entity);
		}
	}

	/**
	 * Update entities
	 * 
	 * @param entities
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<E> update(E... entities) {
		List<E> entitiesResult = new ArrayList<E>();
		for (E entity : entities) {
			entitiesResult.add(entityManager.merge(entity));
		}
		return entitiesResult;

	}

	/**
	 * Get all entities
	 * 
	 * @return List<E>
	 */
	@SuppressWarnings("unchecked")
	public List<E> getAllEntities() {
		return entityManager.createQuery(
				"From " + getEntityClass().getCanonicalName()).getResultList();
	}

	/**
	 * Get entity Class
	 * 
	 * @return Class<E>
	 */
	public abstract Class<E> getEntityClass();
	
	public Object find(Query query) {
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return  new NoResultException();
        }
    }
	
	@SuppressWarnings("unchecked")
    public List<? extends BaseEntity> getRange(int from, int count, Query query) {
        query = query.setFirstResult(from).setMaxResults(count);
        return query.getResultList();
    }
}
