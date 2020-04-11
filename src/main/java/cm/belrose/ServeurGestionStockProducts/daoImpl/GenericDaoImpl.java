/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.belrose.ServeurGestionStockProducts.daoImpl;

import cm.belrose.ServeurGestionStockProducts.dao.GenericDao;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author PC-NGNAWEN
 * @param <E>
 * @param <Id>
 */
public abstract class GenericDaoImpl<E, Id> implements GenericDao<E, Id> {

    @PersistenceContext
    private EntityManager entityManager;
    private final Class<E> entityClass;
    private CriteriaBuilder cb;
    private CriteriaQuery<E> cq;

    public GenericDaoImpl() {
        ParameterizedType genericSuperClass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<E>) genericSuperClass.getActualTypeArguments()[0];
    }

    @Override
    public E create(E e) {
        entityManager.persist(e);
        return e;
    }

    @Override
    public E update(E e) {
        return entityManager.merge(e);
    }

    @Override
    public void delete(E e) {
        entityManager.remove(e);
    }

    @Override
    public E findById(Id id) {
        return entityManager.find(entityClass, id);
    }

    @Override
    public List<E> findAll() {
        cb = entityManager.getCriteriaBuilder();
        cq = cb.createQuery(entityClass);
        cq.from(entityClass);
        return entityManager.createQuery(cq).getResultList();

    }

}
