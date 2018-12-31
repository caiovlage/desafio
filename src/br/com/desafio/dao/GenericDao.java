package br.com.desafio.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.validation.Valid;
import org.springframework.stereotype.Repository;

@Repository
public abstract class GenericDao<T> {

	protected EntityManager entityManager;

	private Class<T> persistedClass;

	protected GenericDao() {
	}

	protected GenericDao(Class<T> persistedClass) {
		this();
		this.persistedClass = persistedClass;
	}

	public T salvar(@Valid T entity) {
		EntityTransaction t = entityManager.getTransaction();
		t.begin();
		entityManager.persist(entity);
		entityManager.flush();
		t.commit();
		return entity;
	}

	public T atualizar(@Valid T entity) {
		EntityTransaction t = entityManager.getTransaction();
		t.begin();
		entityManager.merge(entity);
		entityManager.flush();
		t.commit();
		return entity;
	}

	public void remover(int id) {
		T entity = encontrar(id);
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		T mergedEntity = entityManager.merge(entity);
		entityManager.remove(mergedEntity);
		entityManager.flush();
		tx.commit();
	}

	public List<T> getList() {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<T> query = builder.createQuery(persistedClass);
		query.from(persistedClass);
		return entityManager.createQuery(query).getResultList();
	}

	public T encontrar(int id) {
		return entityManager.find(persistedClass, id);
	}
}