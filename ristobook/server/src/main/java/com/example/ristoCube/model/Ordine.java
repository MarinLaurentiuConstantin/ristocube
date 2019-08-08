/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ristoCube.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author marin
 */
@Entity
public class Ordine implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Integer tavolo;
    
    @Column
    private Double totale;
    
      @ManyToMany(cascade = {CascadeType.MERGE})
    @JoinTable(
            name = "Ordine_Prodotto",
            joinColumns = {@JoinColumn(name = "prodotto_id")},
            inverseJoinColumns = {@JoinColumn(name = "ordine_id")}
    )
   
    private Set<Prodotto> prodotti = new HashSet<>();

    public Double getTotale() {
        return totale;
    }

    public void setTotale(Double totale) {
        this.totale = totale;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTavolo() {
        return tavolo;
    }

    public void setTavolo(Integer tavolo) {
        this.tavolo = tavolo;
    }

    public Set<Prodotto> getProdotti() {
        return prodotti;
    }

    public void setProdotti(Set<Prodotto> prodotti) {
        this.prodotti = prodotti;
    }
    
    
}
