/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.belrose.ServeurGestionStockProducts.services;

import cm.belrose.ServeurGestionStockProducts.entities.Produits;
import java.util.List;

/**
 *
 * @author PC-NGNAWEN
 */
public interface ProduitsService {

    public Produits create(Produits produit);

    public Produits update(Produits produit);

    public void delete(Produits produit);

    public Produits findById(Long id);

    public List<Produits> findAll();
}
