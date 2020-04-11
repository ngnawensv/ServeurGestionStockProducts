/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.belrose.ServeurGestionStockProducts.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.hateoas.RepresentationModel;

/**
 *
 * @author PC-NGNAWEN
 */
@Entity
public class Produits implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private int quantite;
    @Column(name = "prix_unitaire")
    private double prixunitaire;

    public Produits() {
    }

    public Produits(String reference, int quantite, double prixunitaire) {
        this.reference = reference;
        this.quantite = quantite;
        this.prixunitaire = prixunitaire;
    }    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrixunitaire() {
        return prixunitaire;
    }

    public void setPrixunitaire(double prixunitaire) {
        this.prixunitaire = prixunitaire;
    }

    @Override
    public String toString() {
        return "Produits{" + "id=" + id + ", reference=" + reference + ", quantite=" + quantite + ", prixunitaire=" + prixunitaire + '}';
    }

    
}
