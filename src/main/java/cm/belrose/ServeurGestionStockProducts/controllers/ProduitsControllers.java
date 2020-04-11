/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.belrose.ServeurGestionStockProducts.controllers;

import cm.belrose.ServeurGestionStockProducts.entities.Produits;
import cm.belrose.ServeurGestionStockProducts.services.ProduitsService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC-NGNAWEN
 */
@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping(value = "/produits")
public class ProduitsControllers {

    @Autowired
    private ProduitsService produitsService;

    @GetMapping
    public ResponseEntity<List<Produits>> findAllProduct() throws Exception {
        List<Produits> produits = produitsService.findAll();
        if (!produits.isEmpty()) {
            produits.forEach(p -> {
                System.out.println("" + p);
            });
        }else{
            System.out.println("*********Liste des produits vide**************");
        }
        return ResponseEntity.ok(new ArrayList<>(produits));
    }
}
