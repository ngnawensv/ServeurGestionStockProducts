/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.belrose.ServeurGestionStockProducts.servicesImpl;

import cm.belrose.ServeurGestionStockProducts.dao.ProduitsDao;
import cm.belrose.ServeurGestionStockProducts.entities.Produits;
import cm.belrose.ServeurGestionStockProducts.services.ProduitsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author PC-NGNAWEN
 */
@Service
@Transactional
public class ProduitsServiceImpl implements ProduitsService {

    @Autowired
    private ProduitsDao dao;

    @Override
    public Produits create(Produits produit) {
        return dao.create(produit);
    }

    @Override
    public Produits update(Produits produit) {
        return dao.update(produit);
    }

    @Override
    public void delete(Produits produit) {
        dao.delete(produit);
    }

    @Override
    public Produits findById(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Produits> findAll() {
        return dao.findAll();
    }

}
