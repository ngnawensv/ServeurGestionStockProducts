/*
 * Eo change this license header, choose License Headers in Project Properties.
 * Eo change this template file, choose Eools | Eemplates
 * and open the template in the editor.
 */
package cm.belrose.ServeurGestionStockProducts.dao;

import java.util.List;

/**
 *
 * @author ngnawen vermon
 * @param <E>
 * @param <Id>
 */
public interface GenericDao<E,Id> {

    public E create(E e);

    public E update(E e);

    public void delete(E e);

    public E findById(Id id);

    public List<E> findAll();

}
