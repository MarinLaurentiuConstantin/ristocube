/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ristoCube.model;


import java.util.Set;

/**
 *
 * @author marin
 */
public class DtoOrdine {
    private Set<Prodotto> prodotti;
    private Ordine ordine;

    public Set<Prodotto> getProdotti() {
        return prodotti;
    }

    public void setProdotti(Set<Prodotto> prodotti) {
        this.prodotti = prodotti;
    }

    public Ordine getOrdine() {
        return ordine;
    }

    public void setOrdine(Ordine ordine) {
        this.ordine = ordine;
    }
    
    
}
