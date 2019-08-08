/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ristoCube.servicee;


import com.example.ristoCube.model.DtoOrdine;
import com.example.ristoCube.model.Ordine;
import com.example.ristoCube.model.Prodotto;
import java.util.List;



/**
 *
 * @author marin
 */

public interface RistoCubeService {
    
    //SERVICE PRODOTTI
    void aggiungiProdotto(Prodotto prodotto);
    void rimuoviProdotto(Prodotto prodotto); 
   List<Prodotto> getProdotti();
   
   //SERVICE ORDINI
   List<Ordine> getOrdini();
   void aggiungiOrdine(DtoOrdine dto);
   void rimuoviOrdine(Ordine ordine);
}
